package com.subham.myrailapp;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class IndexController {

	@RequestMapping(value = "/")
	public String checkPnr(Model model) {
		return "welcome";
	}
}
