package com.freshvotes;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller //tells spring this is a spring mvc controller
public class DashboardController {

	@RequestMapping(value="/", method=RequestMethod.GET)
	public String rootView() {
		return "index";
	}
}
