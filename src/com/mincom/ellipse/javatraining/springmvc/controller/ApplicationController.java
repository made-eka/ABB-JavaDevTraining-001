/**
 * ABB Java Development Training 2016
 * Ant, Ivy, Spring MVC framework.
 */ 
package com.mincom.ellipse.javatraining.springmvc.controller;
 
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * This is the controller class for the Spring MVC application.
 * 
 * @author Tommy
 *
 */ 
@Controller
public class ApplicationController {
 
	private static final String BACK_BUTTON_KEY = "back";
	private static final String ERROR_PAGE_KEY = "error";
	private static final String FINAL_PAGE_KEY = "finalPage";
    private static final String INDEX_PAGE_KEY = "index";
	private final String MESSAGE_MAP_KEY = "input_message";
	private final static Logger logger = LoggerFactory.getLogger(ApplicationController.class);
 
	/**
	 * This method purposed to display the page when we passing URL
	 * without any parameter.
	 * @param model {@code ModelMap} object purposed to...
	 * @return String of "index".
	 */ 
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String welcome(ModelMap model) {
		model.addAttribute(MESSAGE_MAP_KEY, "");
		logger.debug("Displaying page without input message");
 
		return INDEX_PAGE_KEY;
	}

	/**
	 * This method purposed to display the page when we passing URL
	 * with parameter "/finalPage".
	 * @param model {@code ModelMap} object purposed to...
	 * @return String of "finalPage".
	 */ 
	@RequestMapping(value = "/finalPage", method = RequestMethod.GET)
	public String finalPage(ModelMap model) {
		model.addAttribute(MESSAGE_MAP_KEY, "This is the final message to The Final Page" );
		
		return FINAL_PAGE_KEY;
	}
	
	/**
	 * This method purposed to display the page when we passing URL
	 * with parameter other than "/finalPage".
	 * @param model {@code ModelMap} object purposed to...
	 * @return String of "error".
	 */ 
	@RequestMapping(value = "/{input}", method = RequestMethod.GET)
	public String errorPage(ModelMap model) {
		model.addAttribute(MESSAGE_MAP_KEY, "This is The Error Page" );
		
		return ERROR_PAGE_KEY;
	}
	
	/**
	 * this method will display the index page when back button 
	 * is click.
	 * @param model {@code ModelMap} object purposed to...
	 * @return String of "index".
	 */ 
	@RequestMapping(value = "/back", method = RequestMethod.GET)
	public String index(ModelMap model) {	
		model.addAttribute(MESSAGE_MAP_KEY, "Back to Index");
		return INDEX_PAGE_KEY;
	 }
}	
 
