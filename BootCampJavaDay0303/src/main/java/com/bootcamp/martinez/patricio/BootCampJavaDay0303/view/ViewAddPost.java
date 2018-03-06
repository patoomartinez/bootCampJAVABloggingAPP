package com.bootcamp.martinez.patricio.BootCampJavaDay0303.view;

import java.util.List;

import com.bootcamp.martinez.patricio.BootCampJavaDay0303.model.Post;

public class ViewAddPost {
	public void enterTitle() {
		System.out.println("ENTER TITLE");
	}

	public void enterText() {
		System.out.println("ENTER TEXT");
	}

	public void enterTags() {
		System.out.println("ENTER Tags, one next to the other");
	}

	public void postEliminado() {
		System.out.println("Post eliminado correctamente");
	}

	public void postNoencontrado() {
		System.out.println("Titulo de post invalido");
	}

	public void filters() {
		System.out.println("Search posts by:");
		System.out.println("1.By tagname");
		System.out.println("2.By text");
		System.out.println("3.By posting user");
		System.out.println("4.By Date");
		System.out.println("5.Exit");
	}

	public void writeTag() {
		System.out.println("WRITEN DOWN A TAG");
	}

	public void writeText() {
		System.out.println("WRITEN DOWN A Text");
	}

	public void obtenerPost(Post p) {
		System.out.println(p.toString());
	}

	public void postNotFound() {
		System.out.println("POST NOT FOUND");
	}

	public void writeUserName() {
		System.out.println("WRITEN DOWN User Name");
	}

	public void writeDate() {
		System.out.println("WRITEN DOWN Date of post");
	}

	public void noFilter() {
		System.out.println("No filter has been choosen");
	}

	public  void sortPosts() {
		System.out.println("1.Showing post by Date");
		System.out.println("2.Showing post by Title(Alphabetically)");
		System.out.println("3.Showing post by unique number");
		System.out.println("4.Exit");
	}

	public void newOldest() {
		System.out.println("1.Newest First");
		System.out.println("2.Oldest First");
	}
	
	public void mostrarPost(List post){
		System.out.println(post);
	}
	
	public void enterIdnumber(){
		System.out.println("Entry Id post number");
	}
}
