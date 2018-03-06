package com.bootcamp.martinez.patricio.BootCampJavaDay0303.model;

import java.util.ArrayList;
import java.util.List;

public class Grupo {
	private String name;
	private List usersList;



	public Grupo(String nombre) {
		this.name = nombre;
		usersList = new ArrayList<Object>();
	}

	public void addUsuario(Usuario usuario) {
		usersList.add(usuario);
	}

	public List getListaUsuarios() {
		return usersList;
	}

	public void setListaUsuarios(List listaUsuarios) {
		this.usersList = listaUsuarios;
	}

	public String getNombre() {
		return name;
	}

	public void setNombre(String nombre) {
		this.name = nombre;
	}

	@Override
	public String toString() {
		return "[Grupo: " + name + "]";
	}

	
}
