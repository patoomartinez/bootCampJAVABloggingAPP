package com.bootcamp.martinez.patricio.BootCampJavaDay0303.view;

import com.bootcamp.martinez.patricio.BootCampJavaDay0303.model.Usuario;

public class ViewLogin {
	public void intro() {
		System.out.println("BIENVENIDO");
		System.out.println("1.Login");
		System.out.println("2.Exit");

	}

	public void loginOptions() {
		System.out.println("Enter User Name");
	}
	public void enterEmail(){
		System.out.println("Enter email");
	}

	public void adios() {
		System.out.println("Hasta luego!");
	}

	public void menu() {
		System.out.println("1.Add Post");
		System.out.println("2.Delete Post");
		System.out.println("3.View Posts");
		System.out.println("4.Subscribe to a group");
		System.out.println("5.Show members of a group");
		System.out.println("6.Send emails");
		System.out.println("7.View Emails sent...");
		System.out.println("8.Search Posts by..");
		System.out.println("9.Log out");

		System.out.println("");

	}
	
	public void mostrarUsuario(Usuario pe){
		System.out.println(pe.toString());
	}
	
	public void nombreUsuarioEnUso(){
		System.out.println("Nombre de usuario ya existente, Ingrese nuevo nombre de usuario");
	}
}
