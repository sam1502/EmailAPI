package com.emailingservice.impl;

import javax.mail.internet.MimeMessage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.util.Assert;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.emailingservice.models.Email;

@EnableAutoConfiguration
@RestController
@RequestMapping("/email")
public class EmailSenderService{
	
	@Autowired
	private JavaMailSender javaMailSender;

	@RequestMapping(value = "/send", method = RequestMethod.POST)
	public String sendEmail(@RequestBody Email email) throws Exception {
		Assert.notNull(email, "Email must not be null");
		
		MimeMessage message = javaMailSender.createMimeMessage();
		MimeMessageHelper helper = new MimeMessageHelper(message, true);
		helper.setTo(email.getRecipientEmailId());
		helper.setSubject(email.getEmailSubject());
		helper.setText(email.getEmailMessage(),true);
		// Send Email
		javaMailSender.send(message);
		return "Email Send Successfully";
	}
}
