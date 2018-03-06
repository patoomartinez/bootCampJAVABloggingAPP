package com.bootcamp.martinez.patricio.BootCampJavaDay0303;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import javax.swing.text.View;

import com.bootcamp.martinez.patricio.BootCampJavaDay0303.controller.ControladorEmail;
import com.bootcamp.martinez.patricio.BootCampJavaDay0303.controller.ControladorGrupo;
import com.bootcamp.martinez.patricio.BootCampJavaDay0303.controller.ControladorLogin;
import com.bootcamp.martinez.patricio.BootCampJavaDay0303.controller.ControladorPost;
import com.bootcamp.martinez.patricio.BootCampJavaDay0303.model.Post;
import com.bootcamp.martinez.patricio.BootCampJavaDay0303.model.Usuario;
import com.bootcamp.martinez.patricio.BootCampJavaDay0303.validations.Utilidad;
import com.bootcamp.martinez.patricio.BootCampJavaDay0303.view.ViewAddPost;
import com.bootcamp.martinez.patricio.BootCampJavaDay0303.view.ViewGroup;
import com.bootcamp.martinez.patricio.BootCampJavaDay0303.view.ViewLogin;

public class App {
	static Utilidad u = new Utilidad();
	static ControladorLogin loginControl = new ControladorLogin();
	static ControladorPost postControl = new ControladorPost();
	static ViewLogin loginView = new ViewLogin();
	static ViewAddPost addPostView = new ViewAddPost();
	static ControladorGrupo grupoControl = new ControladorGrupo();
	static ViewGroup groupView = new ViewGroup();
	static ControladorEmail emailControl = new ControladorEmail();

	public static void main(String[] args) throws IOException {

		int a = 0;
		int loginResponse;
		do {

			loginView.intro();
			loginResponse = u.obtenerEnteroPositivo();
			if (loginResponse == 1) {
				loginView.loginOptions();
				String userName;
				do {
					userName = u.obtenerCadenaDeCaracteres();
					if (loginControl.verificarUser(userName) == false) {
						loginView.nombreUsuarioEnUso();
					}
				} while (loginControl.verificarUser(userName) == false);
				loginView.enterEmail();
				String email = u.obtenerCadenaDeCaracteres();
				loginControl.addUsuario(userName, email);
				Usuario pe = loginControl.mostrarUsuarios();

				// pe = loginControl.retornarUsuario();

				loginView.mostrarUsuario(pe);
				inside(pe);

			} else if (loginResponse == 2) {
				loginView.adios();

			}

		} while (a == 2);
	}

	public static void inside(Usuario pe) throws IOException {
		int menuResponse;
		do {
			loginView.menu();

			menuResponse = u.obtenerEnteroPositivo();

			switch (menuResponse) {
			case 1:
				addPost(pe);
				break;
			case 2:
				deletePost();
				break;
			case 3:
				showPost();
				break;

			case 4:
				newGroup(pe);
				break;
			case 5:
				showMembersOfGroup();
				break;
			case 6:
				sendEmail();
				break;

			case 7:

				break;
			case 8:
				searchPosts();
				break;
			default:
				main(null);
				break;
			}
		} while (menuResponse != 9);

	}

	public static void addPost(Usuario pe) {
		addPostView.enterTitle();
		String titlePost = u.obtenerCadenaDeCaracteres();
		addPostView.enterText();
		String textPost = u.obtenerCadenaDeCaracteres();
		addPostView.enterTags();
		List<String> tags = new ArrayList<String>();
		String listTags = u.obtenerCadenaDeCaracteres();
		tags.add(listTags);
		postControl.addPost(titlePost, textPost, tags, pe);

	}

	public static void showPost() {
		postControl.showPost();
		int option = 0;
		do {
			addPostView.sortPosts();
			option = u.obtenerEnteroPositivo();
			if (option == 1) {
				addPostView.newOldest();
				option = u.obtenerEnteroPositivo();
				switch (option) {
				case 1:
					Collections.sort(postControl.getPost(), Collections.reverseOrder());
					addPostView.mostrarPost(postControl.getPost());

					break;
				case 2:
					Collections.sort(postControl.getPost());
					addPostView.mostrarPost(postControl.getPost());

					break;

				default:
					break;
				}
			} else if (option == 2) {
				addPostView.newOldest();
				option = u.obtenerEnteroPositivo();
				switch (option) {
				case 1:
					List l = postControl.comparado();
					addPostView.mostrarPost(l);
					break;
				case 2:
					l = postControl.comparadoReverse();
					addPostView.mostrarPost(l);
					break;

				default:
					break;
				}
			} else if (option == 3) {
				addPostView.enterIdnumber();
				int idPost = u.obtenerEnteroPositivo();
				for (int i = 0; i < postControl.getPost().size(); i++) {
					Post post = postControl.getPost().get(i);
					if (post.getPostId() == idPost) {
						addPostView.obtenerPost(post);
					}
				}
			}
		} while (option != 4);
	}

	public static void deletePost() {
		addPostView.enterText();
		String title = u.obtenerCadenaDeCaracteres();
		if (postControl.deletePost(title) == true) {
			addPostView.postEliminado();
		} else {
			addPostView.postNoencontrado();
		}

	}

	public static void newGroup(Usuario pe) {
		// mostrar grupos
		groupView.listaGrupos();
		groupView.unirse();
		// elegir a que grupo unirse.
		int opcionGrupo = u.obtenerEnteroPositivo();
		try {

			switch (opcionGrupo) {
			case 1:
				grupoControl.addUsertoGroup("React", pe);
				break;
			case 2:
				grupoControl.addUsertoGroup("Angular", pe);
				break;

			case 3:
				grupoControl.addUsertoGroup("Android", pe);
				break;
			case 4:
				grupoControl.addUsertoGroup("iOS", pe);
				break;
			case 5:
				grupoControl.addUsertoGroup("RubyOnRails", pe);
				break;
			default:
				break;

			}
			groupView.inscripCorrecta();
			groupView.separador();
		} catch (Exception e) {
			e.getMessage();
		}

	}

	public static void showMembersOfGroup() {
		grupoControl.mostrarGruposInt();
	}

	public static void searchPosts() {
		addPostView.filters();
		int searchResponse = u.obtenerEnteroPositivo();
		Post p = postControl.obtenerPosts();
		switch (searchResponse) {
		case 1:
			addPostView.writeTag();
			String tagSearching = u.obtenerCadenaDeCaracteres();

			if (p.getTags().contains(tagSearching)) {
				addPostView.obtenerPost(p);
			} else {
				addPostView.postNotFound();
			}
			break;
		case 2:
			addPostView.writeText();
			String textSearching = u.obtenerCadenaDeCaracteres();

			if (p.getText().contains(textSearching)) {
				addPostView.obtenerPost(p);
			} else {
				addPostView.postNotFound();
			}
			break;
		case 3:
			addPostView.writeUserName();
			String userName = u.obtenerCadenaDeCaracteres();

			if (p.getUsuario().getName().contains(userName)) {
				addPostView.obtenerPost(p);
			} else {
				addPostView.postNotFound();
			}
			break;
		case 4:
			String date = p.getDate().toString();

			addPostView.writeDate();
			String dateNew = u.obtenerCadenaDeCaracteres();

			if (dateNew.contains(dateNew)) {
				addPostView.obtenerPost(p);
			} else {
				addPostView.postNotFound();
			}
			break;
		default:
			addPostView.noFilter();
			break;
		}
	}

	public static void sendEmail() throws IOException {
		Usuario reactUser = grupoControl.retornarIntegrante();
		String groupName = "react";
		String bodyText = "you will recive the last React news!for more information enter to www......";
		try {
			File file = new File("Mail to React Group Members.txt");
			if (!file.exists()) {
				file.createNewFile();
			}
			PrintWriter pw = new PrintWriter(file);
			pw.println("TO:" + reactUser.getMail());
			pw.println(bodyText);
			pw.close();
			System.out.println("DONE");

		} catch (IOException e) {
			e.printStackTrace();
			// TODO: handle exception
		}

		emailControl.addEmail(groupName, reactUser.getMail(), bodyText);
	}

}
