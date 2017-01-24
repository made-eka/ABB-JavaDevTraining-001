/**
 * ABB Java Development Training
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
 * The controller class for the Spring application.
 * @author IDMAYUD
 */
@Controller
public class ApplicationController {
 
	private static final String INDEX_PAGE_KEY = "index";
	private static final String FINAL_PAGE_KEY = "finalPage";
	private static final String ERROR_PAGE_KEY = "errorPage";
	private final String MESSAGE_MAP_KEY = "input_message";
	private final static Logger logger = LoggerFactory.getLogger(ApplicationController.class);
 
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String welcome(ModelMap model) {
 
		model.addAttribute(MESSAGE_MAP_KEY, "");
		logger.debug("Displaying page without input message");
 
		return INDEX_PAGE_KEY;
 
	}
 
	@RequestMapping(value = "/{input}", method = RequestMethod.GET)
	public String welcomeName(@PathVariable String input, ModelMap model) {
		
		if (input.isEmpty()) {
			return INDEX_PAGE_KEY;
		} 
		
		model.addAttribute(MESSAGE_MAP_KEY, "Your request is prohibited!");
		return ERROR_PAGE_KEY;
	}
	
	@RequestMapping(value = "/finalPage", method = RequestMethod.GET)
	public String finalPage(ModelMap model) {
		model.addAttribute(MESSAGE_MAP_KEY, "This is the final message to The Final Page" );
		
		return FINAL_PAGE_KEY;
	}
	
	@RequestMapping(value = "/toIndex", method = RequestMethod.GET)
	public String toIndexPage(ModelMap model) {
		model.addAttribute(MESSAGE_MAP_KEY, "Welcome back!" );
		
		return INDEX_PAGE_KEY;
	}
 
}