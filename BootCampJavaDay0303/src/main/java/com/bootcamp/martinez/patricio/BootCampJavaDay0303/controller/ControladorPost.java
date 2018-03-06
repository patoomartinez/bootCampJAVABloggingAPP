package com.bootcamp.martinez.patricio.BootCampJavaDay0303.controller;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.List;

import com.bootcamp.martinez.patricio.BootCampJavaDay0303.dataBase.BaseDeDatos;
import com.bootcamp.martinez.patricio.BootCampJavaDay0303.model.Post;
import com.bootcamp.martinez.patricio.BootCampJavaDay0303.model.Usuario;

public class ControladorPost {

	public void addPost(String title, String text, List tags, Usuario pe) {
		Post post = new Post();
		Date date = new Date();
		post.setTitle(title);
		post.setText(text);
		post.setTags(tags);
		post.setDate(date);
		post.setUsuario(pe);
		BaseDeDatos.posts.add(post);

	}

	public void showPost() {
		for (Post post : BaseDeDatos.getPosts()) {
			System.out.println(post);
		}
	}

	public boolean deletePost(String title) {

		for (int i = 0; i < BaseDeDatos.posts.size(); i++) {
			Post post = BaseDeDatos.posts.get(i);

			if (post.getTitle().equals(title)) {
				BaseDeDatos.posts.remove(post);
				return true;

			}
		}
		return false;

	}

	public Post obtenerPosts() {
		Post p = new Post();
		for (int i = 0; i < BaseDeDatos.posts.size(); i++) {
			Post pe = BaseDeDatos.posts.get(i);
			p = pe;

		}
		return p;
	}

	public List<Post> getPost(){
		return BaseDeDatos.getPosts();
	}
	
	
	public List comparado(){
		List comparado = new ArrayList<>();
		Collections.sort(BaseDeDatos.getPosts(), Comparator.comparing(Post::getTitle));
		comparado.addAll(getPost());
		return comparado;
	}
	
	public List comparadoReverse(){
		List comparado = new ArrayList<>();
		Collections.sort(BaseDeDatos.getPosts(), Comparator.comparing(Post::getTitle).reversed());
		comparado.addAll(getPost());
		return comparado;
	}
}
