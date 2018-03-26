package com.emailingservice.impl;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.emailingservice.models.Email;

@EnableAutoConfiguration
@RestController
@RequestMapping(value = "/email")
public class EmailSenderService {
	
	
	@RequestMapping(value = "/send" , method = RequestMethod.POST)
	public String SendEmail(@RequestBody Email email) throws Exception{
		return "hello";
	}


}
