package ai.uni.gong;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
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
	
	@RequestMapping("/main")
	public String gongmain() {
		return "gongmain";
	}
	
	@RequestMapping("/gong_research")
	public String gong_research() {
		return "gong_research";
	}
	
	@RequestMapping("/gong_research_1")
	public String gong_research_1() {
		return "gong_research_1";
	}
	
	@RequestMapping("/gong_research_2")
	public String gong_research_2() {
		return "gong_research_2";
	}
	
	@RequestMapping("/gong_research_3")
	public String gong_research_3() {
		return "gong_research_3";
	}
	
	@RequestMapping("/gong_insa")
	public String gong_insa() {
		return "gong_insa";
	}
	
	@RequestMapping("/gong_education")
	public String gong_education() {
		return "gong_education";
	}
	
	@RequestMapping("/gong_vision")
	public String gong_vision() {
		return "gong_vision";
	}
}
