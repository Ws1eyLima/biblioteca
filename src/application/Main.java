package application;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;
import java.util.Scanner;

import entities.Livro;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		ArrayList<Livro> lista = new ArrayList<>();
		int opcao;

		do {
			System.out.println("====== Sistema de Biblioteca ======\n" + "1 - Cadastrar Livro\n" + "2 - Listar Livros\n"
					+ "3 - Remover Livros\n" + "4 - Sair");
			opcao = sc.nextInt();
			sc.nextLine();

			switch (opcao) {
			case 1:
				System.out.println("Titulo: ");
				String titulo = sc.nextLine();
				System.out.println("Autor: ");
				String autor = sc.nextLine();
				System.out.println("Codigo do Livro: ");
				int codigoDoLivro = sc.nextInt();
				lista.add(new Livro(titulo, autor, codigoDoLivro));
				break;
			case 2:
				if (lista.isEmpty()) {
					System.out.println("Nenhum livro cadastrado");
				} else {
					System.out.println("=== Lista de Livros ===");
					for (Livro livro : lista) {
						System.out.println(livro);
					}
				}
				break;
			case 3:
				System.out.println("Digite o título do livro a ser removido: ");
				String tituloRemover = sc.nextLine();
				boolean removido = false;

				Iterator<Livro> iterator = lista.iterator();

				while (iterator.hasNext()) {
					Livro livro = iterator.next();
					if (livro.getTitulo().equalsIgnoreCase(tituloRemover)) {
						iterator.remove();
						System.out.println("Livro removido com sucesso");
						removido = true;
						break;
					}
				}
				if (!removido) {
					System.out.println("Livro não encontrado.");
				}
				break;
			case 4:
				System.out.println("Encerrando o sistema...");
				break;
			}

		} while (opcao != 4);

		sc.close();
	}

}
