package com.emailingservice.models;

public class Email {
	
	private String recipientEmailId;
	private String emailMessage;
	private String emailSubject;
	
	public String getRecipientEmailId() {
		return recipientEmailId;
	}
	public void setRecipientEmailId(String recipientEmailId) {
		this.recipientEmailId = recipientEmailId;
	}
	public String getEmailMessage() {
		return emailMessage;
	}
	public void setEmailMessage(String emailMessage) {
		this.emailMessage = emailMessage;
	}
	public String getEmailSubject() {
		return emailSubject;
	}
	public void setEmailSubject(String emailSubject) {
		this.emailSubject = emailSubject;
	}
}
