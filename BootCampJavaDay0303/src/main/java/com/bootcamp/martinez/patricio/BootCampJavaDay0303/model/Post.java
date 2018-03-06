package com.bootcamp.martinez.patricio.BootCampJavaDay0303.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import java.util.Collections;
import java.util.Comparator;

public class Post implements Comparable<Post> {

	private String title;
	private String text;
	private Date date;
	private List<String> tags;
	private int postId;
	private static int contadorPosts;
	
	public int getPostId() {
		return postId;
	}

	public void setPostId(int postId) {
		this.postId = postId;
	}

	private Usuario usuario;

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public Post() {
		tags = new ArrayList<String>();
		postId = ++contadorPosts;
	}

	public Post(String title, String text, Date date, List tags) {
		super();
		this.title = title;
		this.text = text;
		this.date = date;
		this.tags = new ArrayList<String>();
		
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public List<String> getTags() {
		return tags;
	}

	public void setTags(List<String> tags) {
		this.tags = tags;
	}

	public void addTags(String s) {
		tags.add(s);
	}

	@Override
	public String toString() {
		return " " + getUsuario() + "\n Post [title]=" + title.toUpperCase()+"\nPost ID: ["+postId+"]" + "\n Date: [" + date + "]"
				+ " \n [TEXT]:" + text + "\n tags" + tags + "\n *************";
	}

	public int compareTo(Post o) {
		return getDate().compareTo(o.getDate());

	}

	public int compareTo(Post o, Post o1) {
		return getTitle().compareTo(o.getTitle());

	}
	

}
