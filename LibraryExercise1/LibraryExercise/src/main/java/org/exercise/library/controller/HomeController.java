package org.exercise.library.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping(value = "/home")
public class HomeController {

	@RequestMapping(value="/hello", method = RequestMethod.GET)
	public ModelAndView hello(
			@RequestParam(value = "pippo", required=false, defaultValue="World") String name,
			@RequestHeader(required=false) String name1
	) {
		ModelAndView ret = new ModelAndView("home");
		// Adds an objet to be used in home.jsp
		ret.addObject("name", name);
		ret.addObject("name1", name1);
		return ret;
	}
}
