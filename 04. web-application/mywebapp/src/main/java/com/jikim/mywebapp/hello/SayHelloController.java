package com.jikim.mywebapp.hello;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SayHelloController {

	@RequestMapping("/say-hello")
	@ResponseBody
	public String hello() {
		return "Hello! What are you learning today?";
	}
}
