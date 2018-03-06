package com.bootcamp.martinez.patricio.BootCampJavaDay0303.controller;

import com.bootcamp.martinez.patricio.BootCampJavaDay0303.dataBase.BaseDeDatos;
import com.bootcamp.martinez.patricio.BootCampJavaDay0303.model.Email;
import com.bootcamp.martinez.patricio.BootCampJavaDay0303.model.Usuario;

public class ControladorEmail {
	public void addEmail(String groupName, String email, String body) {
		Email nuevoMail = new Email();
		nuevoMail.setDestinatarios(email);
		nuevoMail.setNameBlog(groupName);
		nuevoMail.setBodyText(body);
		BaseDeDatos.emails.add(nuevoMail);
		
	}
}
