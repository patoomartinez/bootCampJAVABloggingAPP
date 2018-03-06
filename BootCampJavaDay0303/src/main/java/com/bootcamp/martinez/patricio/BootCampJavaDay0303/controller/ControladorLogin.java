package com.bootcamp.martinez.patricio.BootCampJavaDay0303.controller;

import java.util.ArrayList;

import com.bootcamp.martinez.patricio.BootCampJavaDay0303.dataBase.BaseDeDatos;
import com.bootcamp.martinez.patricio.BootCampJavaDay0303.model.Usuario;

public class ControladorLogin {

	public void addUsuario(String userName, String email) {
		Usuario nuevoUsuario = new Usuario();
		nuevoUsuario.setName(userName);
		nuevoUsuario.setMail(email);
		BaseDeDatos.usuarios.add(nuevoUsuario);
	
	}

	public Usuario mostrarUsuarios() {
		Usuario u = new Usuario();
		for (Usuario usuario : BaseDeDatos.getUsuarios()) {
			u = usuario;
		}
		return u;
	}

	public Usuario retornarUsuario() {
		Usuario user = new Usuario();
		for (int i = 0; i < BaseDeDatos.usuarios.size(); i++) {
			Usuario u = BaseDeDatos.usuarios.get(i);
			user = u;
		}
		return user;

	}
	
	public boolean verificarUser(String userName){
		for (int i = 0; i < BaseDeDatos.usuarios.size(); i++) {
			Usuario u = BaseDeDatos.usuarios.get(i);
			if(u.getName().equals(userName)){
				return false;
			}
	} return true;
	}
}
