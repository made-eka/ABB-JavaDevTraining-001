/**
 * ABB Java Development Training
 * Training part 1
 * Application Controller
 * @author  Andri Widiya
 */
package com.mincom.ellipse.javatraining.springmvc.controller;
 
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class ApplicationController {
 
	private static final String ERROR_PAGE_KEY = "errorPage";
	private static final String FINAL_PAGE_KEY = "finalPage";
	private static final String INDEX_PAGE_KEY = "index";
	private final String MESSAGE_MAP_KEY = "input_message";
	private final static Logger logger = LoggerFactory.getLogger(ApplicationController.class);
 
 /**
  * This method is used to display index page
  * @param model 
  * @return string
  */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String welcome(ModelMap model) {
		model.addAttribute(MESSAGE_MAP_KEY, "");
		logger.debug("Displaying page without input message");
 
		return INDEX_PAGE_KEY;
	}
 
 /**
  * This method is used to display error page
  * @param String input
  * @param model   
  * @return string
  */ 
	@RequestMapping(value = "/{input}", method = RequestMethod.GET)
	public String welcomeName(@PathVariable String input, ModelMap model) {
		model.addAttribute(MESSAGE_MAP_KEY,  "Error Babe!");
		logger.debug("Displaying page with input message : {}", input);

		return ERROR_PAGE_KEY;
	}

 /**
  * This method is used to display final page
  * @param model   
  * @return string
  */ 
	@RequestMapping(value = "/finalPage", method = RequestMethod.GET)
	public String finalPage(ModelMap model) {
		model.addAttribute(MESSAGE_MAP_KEY, "This is the final message to The Final Page" );
		logger.debug("Displaying final page");
		
		return FINAL_PAGE_KEY;
	}

 /**
  * This method is used to display previous page
  * @param model   
  * @return string
  */ 
	@RequestMapping(value = "/backPage", method = RequestMethod.GET)
	public String backPage(ModelMap model) {
		model.addAttribute(MESSAGE_MAP_KEY, "Back from the dead" );
		logger.debug("Displaying index page using back button");
		
		return INDEX_PAGE_KEY;
	}
	
}