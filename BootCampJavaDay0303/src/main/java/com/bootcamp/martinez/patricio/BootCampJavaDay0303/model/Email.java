package com.bootcamp.martinez.patricio.BootCampJavaDay0303.model;

public class Email {
	private String recipients;
	private String nameBlog;
	private String bodyText;

	public Email() {

	}

	public String getDestinatarios() {
		return recipients;
	}

	public void setDestinatarios(String destinatarios) {
		this.recipients = destinatarios;
	}

	public String getNameBlog() {
		return nameBlog;
	}

	public void setNameBlog(String nameBlog) {
		this.nameBlog = nameBlog;
	}

	public String getBodyText() {
		return bodyText;
	}

	public void setBodyText(String bodyText) {
		this.bodyText = bodyText;
	}

	@Override
	public String toString() {
		return "Email "+"\n[Recipient]: " + recipients + ",\n [Blog Name]=" + nameBlog + ",\n [Text]: " + bodyText + "]";
	}

	
}
