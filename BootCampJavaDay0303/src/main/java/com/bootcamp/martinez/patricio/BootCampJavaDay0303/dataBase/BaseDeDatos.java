package com.bootcamp.martinez.patricio.BootCampJavaDay0303.dataBase;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import com.bootcamp.martinez.patricio.BootCampJavaDay0303.model.*;

public class BaseDeDatos {
	public static List<Usuario> usuarios = new ArrayList<Usuario>();
	public static List<Post> posts = new ArrayList<Post>();
	public static List<Grupo> grupos = new ArrayList<Grupo>();
	public static Queue<Email> emails = new LinkedList<Email>();

	public static List<Post> getPosts() {
		return posts;
	}

	public void setPosts(List<Post> posts) {
		this.posts = posts;
	}

	public static List<Usuario> getUsuarios() {
		return usuarios;
	}

	public void setUsuarios(List<Usuario> usuarios) {
		this.usuarios = usuarios;
	}

	public void addUsuario(Usuario usuario) {
		this.usuarios.add(usuario);
	}

	public void addPost(Post post) {
		this.posts.add(post);
	}

	public static List<Grupo> getGrupos() {
		return grupos;
	}

	public static void setGrupos(List<Grupo> grupos) {
		BaseDeDatos.grupos = grupos;
	}

	public void addGrupo(Grupo grupo) {
		this.grupos.add(grupo);
	}

	public static Queue<Email> getEmails() {
		return emails;
	}

	public static void setEmails(Queue<Email> emails) {
		BaseDeDatos.emails = emails;
	}

	
	public void addEmail(Email email){
		this.emails.add(email);
	}
}
