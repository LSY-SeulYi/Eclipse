package com.vision.transaction_after;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.vision.transaction_after.dao.TicketDao;
import com.vision.transaction_after.dto.TicketDto;

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
	
	private TicketDao dao;
	
	@Autowired
	public void setDao(TicketDao dao) {
		this.dao = dao;
	}
	
	@RequestMapping("/buy_ticket_card") // 발권
	public String buy_ticket_card(TicketDto ticketDto, Model model) {
	System.out.println( "buy_ticket_card:발권" );
	System.out.println( "ticketDto : " + ticketDto.getConsumerid() );
	System.out.println( "ticketDto : " + ticketDto.getAmount() );

	String res="";
	res = dao.buyTicket(ticketDto);

	model.addAttribute("ticketInfo", ticketDto);
	model.addAttribute("result",res);
	return "buy_ticket_end";
	}
	
}
