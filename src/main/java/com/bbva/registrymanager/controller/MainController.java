package com.bbva.registrymanager.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.bbva.registrymanager.constant.ViewConstant;

@Controller
public class MainController {
	
	private static final Logger LOG = LoggerFactory.getLogger(MainController.class);
	
	@GetMapping("/")
	public String showIndex(){
		LOG.info("METHOD: showIndex()");
		LOG.info("Heading to " + ViewConstant.INDEX);
		return ViewConstant.INDEX;
	}

}
