package aula05.exer5;

import java.util.Scanner;
import aula05.Util;
import aula05.exer4.Book;
import aula05.exer4.User;

public class Exer5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Book catalog[] = new Book[100];
		User users[] = new User[100];
		int input;
		int nUsers = 0;
		int nBooks = 0;

		do {
			System.out.println("1 - inscrever utilizador");
			System.out.println("2 - remover utilizador");
			System.out.println("3 - imprimir lista de utilizadores");
			System.out.println("4 - registar um novo livro");
			System.out.println("5 - imprimir lista de livros");
			System.out.println("6 - emprestar");
			System.out.println("7 - devolver");
			System.out.println("8 - sair");

			input = Util.getInt("Escolha uma operação: ", sc, 1, 8);

			switch (input) {
				case 1:
					int nMec = Util.getInt("Introduza o número de mec: ", sc);
					String name = Util.getString("Introduza o nome: ", sc);
					String course = Util.getString("Introduza o curso: ", sc);

					users[nUsers++] = new User(name, nMec, course);
					break;

				case 2:
					int nMec2 = Util.getInt("Introduza o número de mec: ", sc);
					int i = 0;
					boolean found = false;

					while (i < nUsers && !found) {
						if (users[i].getnMec() == nMec2) {
							found = true;
							users[i] = null;
						}
						i++;
					}

					if (!found) System.out.println("Número mec não encontrado.");
					break;

				case 3:
					for (int j = 0; j < nUsers; j++) {
						if (users[j] != null) System.out.println(users[j]);
					}
					break;

				case 4:
					String title = Util.getString("Introduza o título: ", sc);
					String typeLoan = Util.getString("Introduza o tipo de empréstimo: ", sc);

					catalog[nBooks++] = new Book(title, typeLoan);
					break;

				case 5:
					for (int j = 0; j < nBooks; j++) {
						if (catalog[j] != null) System.out.println(catalog[j]);
					}
					break;

				case 6:
					int nMec3 = Util.getInt("Introduza o número de mec: ", sc);
					int id = Util.getInt("Introduza o id do livro: ", sc);
					
					User user = getUser(nMec3, users, nUsers);
					Book book = getBook(id, catalog, nBooks);

					if (user != null && book != null) {
						if (book.isLoaned()) {
							System.out.println("Livro já emprestado.");
						} else {
							if (user.getBooks() != null && user.getBooks().size() >= 3) {
								System.out.println("Utilizador já possui 3 livros emprestados.");
							} else {
								user.addBook(book.getId());
								book.setLoaned(true);
								System.out.println("Livro emprestado com sucesso.");
							}
						}
					} else {
						System.out.println("Número mec. ou id de livro inválidos.");
					}
					break;

				case 7:
					int nMec4 = Util.getInt("Introduza o número de mec: ", sc);
					int id2 = Util.getInt("Introduza o id do livro: ", sc);
					
					User user2 = getUser(nMec4, users, nUsers);
					Book book2 = getBook(id2, catalog, nBooks);

					if (user2 != null && book2 != null) {
						if (!book2.isLoaned()) {
							System.out.println("Livro não emprestado.");
						} else {
							if (!user2.hasBook(book2.getId())) {
								System.out.println("Livro não emprestado ao utilizador.");
							} else {
								user2.removeBook(book2.getId());
								book2.setLoaned(false);
								System.out.println("Livro devolvido com sucesso.");
							}
						}
					} else {
						System.out.println("Número mec. ou id de livro inválidos.");
					}
					break;

				case 8:
					break;
			}

			System.out.println();
		} while (input != 8);
	}

	public static User getUser(int nMec, User users[], int nUsers) {
		int i = 0;
		boolean found = false;

		while (i < nUsers && !found) {
			if (users[i].getnMec() == nMec) {
				found = true;
				return users[i];
			}
			i++;
		}

		return null;
	}

	public static Book getBook(int id, Book catalog[], int nBooks) {
		int i = 0;
		boolean found = false;

		while (i < nBooks && !found) {
			if (catalog[i].getId() == id) {
				found = true;
				return catalog[i];
			}
			i++;
		}

		return null;
	}
}
