package com.emailingservice.models;
import static org.junit.Assert.*;
import org.junit.*;
import com.emailingservice.models.*;

public class EmailTest {

private Email email = new Email();
private String recipientEmailId = "TEST";
private String emailMessage = "TEST";
private String emailSubject = "TEST";

@Test
public void getRecipientEmailId(){
	initPOJOs();
	assertEquals(recipientEmailId, email.getRecipientEmailId());
}

@Test
public void getEmailMessage(){
	initPOJOs();
	assertEquals(emailMessage, email.getEmailMessage());
}

@Test
public void getEmailSubject(){
	initPOJOs();
	assertEquals(emailSubject, email.getEmailSubject());
}

private  void initPOJOs(){
	email.setRecipientEmailId(recipientEmailId);
	email.setEmailMessage(emailMessage);
	email.setEmailSubject(emailSubject);
}
}
