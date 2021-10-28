package ai.uni.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import ai.uni.dto.UniPaging;
import ai.uni.dto.UniReplyPageDTO;
import ai.uni.dto.UniReplyVO;
import ai.uni.service.UniReplyService;
import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j;

@RequestMapping("/replies/")
@RestController
@Log4j
@AllArgsConstructor
public class UniReplyController {

	private UniReplyService service;
	
	@PostMapping(value="/new", consumes="application/json", produces= {MediaType.TEXT_PLAIN_VALUE})
	public ResponseEntity<String> create(@RequestBody UniReplyVO vo){
		log.info("UniReplyVO : "+vo);
		int insertCount = service.register(vo);
		log.info("Reply INSERT COUNT : " +insertCount);
		return insertCount ==1 ? new ResponseEntity<>("success", HttpStatus.OK) : new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
	}
	
//	@GetMapping(value="pages/{no}/{page}", produces= {MediaType.APPLICATION_XML_VALUE, MediaType.APPLICATION_JSON_UTF8_VALUE})
//	public ResponseEntity<List<UniReplyVO>> getList(@PathVariable("page")int page, @PathVariable("no")Long no){
//		log.info("getList");
//		UniPaging unip = new UniPaging(page, 10);
//		log.info(unip);
//		return new ResponseEntity<>(service.getList(unip, no), HttpStatus.OK);
//	}
	@GetMapping(value = "/pages/{no}/{page}", produces = { MediaType.APPLICATION_XML_VALUE, MediaType.APPLICATION_JSON_UTF8_VALUE })
	public ResponseEntity<UniReplyPageDTO> getList(@PathVariable("page") int page, @PathVariable("no") Long no) {

		UniPaging unip = new UniPaging(page, 10);
		log.info("get Reply List no: " + no);
		log.info("unip:" + unip);
		return new ResponseEntity<>(service.getListPage(unip, no), HttpStatus.OK);
	}
	
	@GetMapping(value = "/{rno}", produces = { MediaType.APPLICATION_XML_VALUE, MediaType.APPLICATION_JSON_UTF8_VALUE })
	public ResponseEntity<UniReplyVO> get(@PathVariable("rno") Long rno) {
		log.info("get: " + rno);
		return new ResponseEntity<>(service.get(rno), HttpStatus.OK);
	}

	@RequestMapping(method = { RequestMethod.PUT,
			RequestMethod.PATCH }, value = "/{rno}", consumes = "application/json", produces = {
					MediaType.TEXT_PLAIN_VALUE })
	public ResponseEntity<String> modify(@RequestBody UniReplyVO vo, @PathVariable("rno") Long rno) {
		vo.setRno(rno);
		log.info("rno: " + rno);
		log.info("modify: " + vo);
		return service.modify(vo) == 1 ? new ResponseEntity<>("success", HttpStatus.OK)
				: new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
	}

	@DeleteMapping(value = "/{rno}", produces = { MediaType.TEXT_PLAIN_VALUE })
	public ResponseEntity<String> remove(@PathVariable("rno") Long rno) {
		log.info("remove: " + rno);
		return service.remove(rno) == 1 ? new ResponseEntity<>("success", HttpStatus.OK)
				: new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
	}
}
