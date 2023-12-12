package estruturadedaos;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Fila {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue<String> fila = new LinkedList<String>();
		Scanner ler = new Scanner(System.in);
		int op;

		do {
			System.out.println("\n---------------------------------");
			System.out.println("\n\t\tMenu de Agendamento");
			System.out.println("\n(1) Adicionar Agendamento?");
			System.out.println("\n(2) Mostrar Nomes agendados?");
			System.out.println("\n(3) Pesquisar Agendamento?");
			System.out.println("\n(4) Agendamento concluído?");
			System.out.println("\n(0) Sair do programa");
			System.out.println("\n---------------------------------");
			System.out.println("\nDigite sua opção");

			op = ler.nextInt();

			switch (op) {
			case 1:
				ler.nextLine();
				System.out.println("\nDigite o nome: ");
				fila.add(ler.nextLine());
				break;

			case 2:
				System.out.println("\nNomes agendados: \n" + fila);
				break;

			case 3:
				ler.nextLine();
				System.out.println("\nDigite o nome: ");
				System.out.println("\nEste nome: " + fila.contains(ler.nextLine()));
				break;
				
			case 4:
				ler.nextLine();
				System.out.println("\nNome: "+fila.remove()+"atendimento concluído");	
				break;

			default:
				break;
			}

		} while (op != 0);

		ler.close();

	}

}
