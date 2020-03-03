package com.rest.api1;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestApi1Controller {
	@RequestMapping(value = "getRestApi1", method = RequestMethod.GET)
	public String getRestApi1() {
		return "Get Rest Api1";
	}
}
