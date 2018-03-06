package com.bootcamp.martinez.patricio.BootCampJavaDay0303.model;

public class Usuario {
	private String name;
	private String mail;

	public Usuario() {
			}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}


	public Usuario(String tag) {
		super();
		this.name = tag;
	}

	public String getName() {
		return name;
	}

	public void setName(String tag) {
		this.name = tag;
	}

	@Override
	public String toString() {
		return "[Username=" + name + "]";
	}

}
