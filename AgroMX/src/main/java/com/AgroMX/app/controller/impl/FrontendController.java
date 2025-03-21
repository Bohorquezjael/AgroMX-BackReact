package com.AgroMX.app.controller.impl;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class FrontendController {

	@RequestMapping({"/{path:[^\\.]*}"})
	public String forward() {
		return "forward:/index.html";
	}
}