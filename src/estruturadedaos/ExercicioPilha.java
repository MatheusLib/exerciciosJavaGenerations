package estruturadedaos;

import java.util.Scanner;
import java.util.Stack;

public class ExercicioPilha {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<String> pilha = new Stack<String>();
		Scanner ler = new Scanner(System.in);
		int op;

		do {
			System.out.println("\n---------------------------------");
			System.out.println("\n\t\tMenu de Agendamento");
			System.out.println("\n(1) Adicionar Livro a pilha");
			System.out.println("\n(2) Mostrar livros na pilha");
			System.out.println("\n(3) Retirar livro da pilha?");
			System.out.println("\n(0) Sair do programa");
			System.out.println("\n---------------------------------");
			System.out.println("\nDigite sua opção");

			op = ler.nextInt();
			switch (op) {
			case 1:
				ler.nextLine();
				System.out.println("\nDigite o nome do livro: ");
				pilha.push(ler.nextLine());
				
				break;
			case 2:
				System.out.println("\nLista de Livros na Pilha: \n" + pilha);
				break;
			case 3:
				if (pilha.size()==0)
					System.out.println("A Pilha  está vazia!");
				else {
					ler.nextLine();
					System.out.println("\nNome: "+pilha.pop()+" livro retirado");
				}
				break;
			case 0:
				System.out.println("Programa Finalizado!");
				break;
			default:
				System.out.println("Comando inválido");
				break;
			}

		} while (op != 0);

		ler.close();

	}

}