package ai.uni.controller;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import ai.uni.dto.UniBoardAttachVO;
import ai.uni.dto.UniBoardVO;
import ai.uni.dto.UniPageDTO;
import ai.uni.dto.UniPaging;
import ai.uni.dto.UniUsersVO;
import ai.uni.service.UniBoardService;
import ai.uni.service.UniUsersService;
import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j;

@Controller
@Log4j
@RequestMapping("/board/*")
@AllArgsConstructor
public class UniBoardController {

	private UniBoardService uniservice;
	

	@GetMapping("/list")
	public void list(UniPaging unip, Model model) {
		
		log.info("list : "+unip);
		model.addAttribute("list", uniservice.getList(unip));
		// model.addAttribute("pageMaker", new UniPageDTO(unip, 123));
		int total = uniservice.getTotal(unip);
		log.info("total : "+ total);
		model.addAttribute("pageMaker", new UniPageDTO(unip, total));
	}
	
	@GetMapping("/list_before")
	public void list_before(UniPaging unip, Model model) {
		
		log.info("list_before : "+unip);
		model.addAttribute("list", uniservice.getList(unip));
		// model.addAttribute("pageMaker", new UniPageDTO(unip, 123));
		int total = uniservice.getTotal(unip);
		log.info("total : "+ total);
		model.addAttribute("pageMaker", new UniPageDTO(unip, total));
	}
	
	@GetMapping("/list_after")
	public void list_after(UniPaging unip, Model model) {
		
		log.info("list_after : "+unip);
		model.addAttribute("list", uniservice.getList(unip));
		// model.addAttribute("pageMaker", new UniPageDTO(unip, 123));
		int total = uniservice.getTotal(unip);
		log.info("total : "+ total);
		model.addAttribute("pageMaker", new UniPageDTO(unip, total));
	}
	
	@GetMapping("/register")
	public void register() {

	}
	
	@PostMapping("/register")
	public String register(UniBoardVO uniBoard, RedirectAttributes rttr) {
		log.info("==========================");
		log.info("register : "+uniBoard);
		if (uniBoard.getAttachList() != null) {
				uniBoard.getAttachList().forEach(attach -> log.info(attach));
		}
		log.info("==========================");
		uniservice.register(uniBoard);
		rttr.addFlashAttribute("result", uniBoard.getNo());
		return "redirect:/board/list";
	}
	
//	@GetMapping("/get")
//	public void get(@RequestParam("no") Long no, Model model) {
//		log.info("/get");
//		model.addAttribute("UniBoard", uniservice.get(no));
//	}
	@GetMapping({"/get", "/modify"})
	public void get(@RequestParam("no") Long no, @ModelAttribute("unip") UniPaging unip, Model model) {
		log.info("/get or modify");
		model.addAttribute("uniBoard", uniservice.get(no));
	}
	
	@GetMapping({"/get_after", "/modify_after"})
	public void get_after(@RequestParam("no") Long no, @ModelAttribute("unip") UniPaging unip, Model model) {
		log.info("/get or modify");
		model.addAttribute("uniBoard", uniservice.get(no));
	}
	
	@GetMapping({"/get_before", "/modify_before"})
	public void get_before(@RequestParam("no") Long no, @ModelAttribute("unip") UniPaging unip, Model model) {
		log.info("/get or modify");
		model.addAttribute("uniBoard", uniservice.get(no));
	}
	
	@PostMapping("/modify")
	public String modify(UniBoardVO uniBoard, @ModelAttribute("unip") UniPaging unip, RedirectAttributes rttr) {
		log.info("modify : "+uniBoard);
		
		if(uniservice.modify(uniBoard)) {
			rttr.addFlashAttribute("result","success");
		}
		
		rttr.addAttribute("pageNum", unip.getPageNum());
		rttr.addAttribute("amount", unip.getAmount());
		rttr.addAttribute("type", unip.getType());
		rttr.addAttribute("keyword", unip.getKeyword());
		
		return "redirect:/board/list";
	}
	
	@PostMapping("/remove")
	public String remove(@RequestParam("no") Long no, UniPaging unip, RedirectAttributes rttr) {		
		log.info("remove : "+no);
		List<UniBoardAttachVO> attachList = uniservice.getAttachList(no);
		if(uniservice.remove(no)) {
			deleteFiles(attachList);
			rttr.addFlashAttribute("result", "success");
		}		
		return "redirect:/board/list" + unip.getListLink();
	}	
		
	@GetMapping(value = "/getAttachList",
		    produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	@ResponseBody
	public ResponseEntity<List<UniBoardAttachVO>> getAttachList(Long no) {
		log.info("getAttachList " + no);
		return new ResponseEntity<>(uniservice.getAttachList(no), HttpStatus.OK);
	}
	
	private void deleteFiles(List<UniBoardAttachVO> attachList) {
		if(attachList == null || attachList.size() == 0) {
			return;
		}    
		log.info("delete attach files...................");
		log.info(attachList);	    
		attachList.forEach(attach -> {
			try {        
				Path file  = Paths.get("C:\\upload\\"+attach.getUploadPath()+"\\" + attach.getUuid()+"_"+ attach.getFileName());
				Files.deleteIfExists(file);
				if(Files.probeContentType(file).startsWith("image")) {
					Path thumbNail = Paths.get("C:\\upload\\"+attach.getUploadPath()+"\\s_" + attach.getUuid()+"_"+ attach.getFileName());
					Files.delete(thumbNail);
				}
			}catch(Exception e) {
				log.error("delete file error" + e.getMessage());
			}//end catch
		});//end foreachd
	}
	
	private UniUsersService userservice;

	
	@GetMapping("/join")
	public void join() {
		
	}
	
	@PostMapping("/join")
	public String join(UniUsersVO uservo, RedirectAttributes rttr) {
		log.info("join : "+uservo);
		userservice.register(uservo);
		rttr.addFlashAttribute("result", uservo.getUni_no());
		return "redirect:/";
	}
	
	@RequestMapping("/list/logout")
	public String board_list_logout() {
		return "redirect:/main1";
	}
	
	@RequestMapping("/list_before/login")
	public String login() {
		return "./login/login";
	}
	
	@RequestMapping(value="/list_before/loginOk", method = RequestMethod.POST)
	public String loginOk() {
		return "./board/loginOk";
	}
	@RequestMapping("/logout")
	public String get_board_list_logout() {
		return "redirect:/main1";
	}
	
	@RequestMapping("/login")
	public String get_login() {
		return "./login/login";
	}
	
	@RequestMapping(value="/loginOk", method = RequestMethod.POST)
	public String get_loginOk() {
		return "./board/loginOk";
	}
	@RequestMapping("/list_after/logout")
	public String logout1() {
		return "redirect:/main1";
	}
}