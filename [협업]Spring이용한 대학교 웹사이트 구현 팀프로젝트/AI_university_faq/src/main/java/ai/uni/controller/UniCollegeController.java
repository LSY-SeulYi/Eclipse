package ai.uni.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import ai.uni.dto.UniUsersVO;
import ai.uni.service.UniUsersService;
import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j;

@Controller
@Log4j
@AllArgsConstructor
public class UniCollegeController {


	@RequestMapping("/college/index")
	public String index() {
		return "college/index";
	}
	
	@RequestMapping("/college/about")
	public String about() {
		return "college/about";
	}
	
	@RequestMapping("/college/post")
	public String post() {
		return "college/post";
	}
	
	@RequestMapping("/college/contact")
	public String contact() {
		return "college/contact";
	}
	
	@RequestMapping("/college_medicine/index")
	public String medicine_index() {
		return "college_medicine/index";
	}
	
	@RequestMapping("/college_medicine/about1")
	public String medicine_about1() {
		return "college_medicine/about1";
	}
	
	@RequestMapping("/college_medicine/about2")
	public String medicine_about2() {
		return "college_medicine/about2";
	}
	
	@RequestMapping("/college_medicine/post")
	public String medicine_post() {
		return "college_medicine/post";
	}
	
	@RequestMapping("/college_medicine/contact")
	public String college_medicinecontact() {
		return "college_medicine/contact";
	}

}
