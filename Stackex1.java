package QuStk;
import java.util.Collection;
import java.util.Scanner;
import java.util.Stack;

public class Stackex1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Stack<String> pilha = new Stack<>();

		String titulo;
		int op = 1;

		while (op != 0) {
			System.out.print("""
					\n ________________________________________________
					|                                               |
					|                                               |
					|        1 - Adicionar Livro na Pilha           |
					|        2 - Listar Todos Livros                |
					|        3 - Retirar Livro da Pilha             |
					|        0 - Sair                               |
					|                                               |
					|_______________________________________________|
					Entre com a opção desejada: """);

			op = sc.nextInt();
			sc.nextLine();

			switch (op) {

			case 1:
				System.out.println("Adicione um livro: ");
				titulo = sc.nextLine();
				pilha.add(titulo);
				for (String livro : pilha) {
					System.out.println(livro);
				}
				System.out.println("Livro adicionado");
				break;

			case 2:
				if (pilha.isEmpty())
					System.out.println("A pilha esta vazia!");
				else {
					System.out.println("Lista de livros: ");
					for (String livro : pilha) {
						System.out.println(livro);
					}

				}
				break;

			case 3:
				if (pilha.isEmpty())
					System.out.println("A pilha esta vazia!");
				else {
					pilha.pop();
					for (String livro : pilha) {
						System.out.println(livro);
					} System.out.println("Um livro foi retirado da pilha!");
						
				}
					
				break;

			case 0:
				System.out.println("Programa Finalizado");

				break;
			}
		}
	}

}
