package com.bootcamp.martinez.patricio.BootCampJavaDay0303.controller;

import java.util.ArrayList;
import java.util.List;

import com.bootcamp.martinez.patricio.BootCampJavaDay0303.dataBase.BaseDeDatos;
import com.bootcamp.martinez.patricio.BootCampJavaDay0303.model.Grupo;
import com.bootcamp.martinez.patricio.BootCampJavaDay0303.model.Usuario;

public class ControladorGrupo {

	Grupo react = new Grupo("React");
	Grupo angular = new Grupo("Angular");
	Grupo android = new Grupo("Android");
	Grupo ios = new Grupo("iOS");
	Grupo rubyOnRails = new Grupo("RubyOnRails");
	{
		BaseDeDatos.grupos.add(react);
		BaseDeDatos.grupos.add(angular);
		BaseDeDatos.grupos.add(android);
		BaseDeDatos.grupos.add(ios);
		BaseDeDatos.grupos.add(rubyOnRails);

	}

	public void addUsertoGroup(String name, Usuario pe) {
		if (name.equals("React")) {
			react.addUsuario(pe);
		} else if (name.equals("Angular")) {
			angular.addUsuario(pe);

		} else if (name.equals("Android"))

		{
			android.addUsuario(pe);
		} else if (name.equals("iOS")) {
			ios.addUsuario(pe);
		} else if (name.equals("RubyOnRails")) {
			rubyOnRails.addUsuario(pe);
		}

	}

	public void mostrarGruposInt() {
		for (int i = 0; i < BaseDeDatos.getGrupos().size(); i++) {
			Grupo g = BaseDeDatos.getGrupos().get(i);
			List pe = g.getListaUsuarios();
			System.out.println(" " + g + " Integrantes: " + pe);
		}
	}

	public Usuario retornarIntegrante() {
		Usuario u = new Usuario();
	for (int i = 0; i <react.getListaUsuarios().size(); i++) {
		List a = react.getListaUsuarios();
		for (int j = 0; j < a.size(); j++) {
			Usuario ua = (Usuario) a.get(j);
			u = ua;
			
		}
	}
			
		return u;
	}
	
	
	
	

}
