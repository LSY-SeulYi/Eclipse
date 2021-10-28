package ai.uni.controller;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;
import javax.servlet.http.HttpSession;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {}.", locale);
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);
		
		model.addAttribute("serverTime", formattedDate );
		
		return "home";
	}
	
	@RequestMapping("/main1")
	public String main_before() {
		return "./main/main_before";
	}
	
	@RequestMapping("/main2")
	public String main_admin() {
		return "./main/main_admin";
	}
	
	@RequestMapping("/main3")
	public String main_after() {
		return "./main/main_after";
	}

	@RequestMapping("/login")
	public String login() {
		return "./login/login";
	}
	
	@RequestMapping(value="/loginOk", method = RequestMethod.POST)
	public String loginOk() {
		return "./login/loginOk";
	}
	
	@RequestMapping("/intro1")
	public String intro1() {
		return "./intro/intro1";
	}
	
	@RequestMapping("/intro2")
	public String intro2() {
		return "./intro/intro2";
	}
	
	@RequestMapping("/intro3")
	public String intro3() {
		return "./intro/intro3";
	}
	
	@RequestMapping("/intro4")
	public String intro4() {
		return "./intro/intro4";
	}
	
	@RequestMapping("/aiuni")
	public String aiuni() {
		return "intro_before";
	}
	
	@RequestMapping("/logout")
	public String logout() {
		return "./login/logout";
	}
	
	@RequestMapping("/findId")
	public String findId() {
		return "./id_pw_find/findId";
	}
	
	@RequestMapping("/findIdOk")
	public String findIdOk() {
		return "./id_pw_find/findIdOk";
	}
	
	@RequestMapping("/findPw")
	public String findPw() {
		return "./id_pw_find/findPw";
	}
	
	@RequestMapping("/findPwOk")
	public String findPwOk() {
		return "./id_pw_find/findPwOk";
	}
	
	
}
