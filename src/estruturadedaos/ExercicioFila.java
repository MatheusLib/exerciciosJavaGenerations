package estruturadedaos;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class ExercicioFila {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue<String> fila = new LinkedList<String>();
		Scanner ler = new Scanner(System.in);
		int op;

		do {
			System.out.println("\n---------------------------------");
			System.out.println("\n\t\tMenu de Agendamento");
			System.out.println("\n(1) Adicionar Cliente a Fila");
			System.out.println("\n(2) Mostrar Clientes na Fila");
			System.out.println("\n(3) Retirar clientes da Fila?");
			System.out.println("\n(0) Sair do programa");
			System.out.println("\n---------------------------------");
			System.out.println("\nDigite sua opção");

			op = ler.nextInt();
			switch (op) {
			case 1:
				ler.nextLine();
				System.out.println("\nDigite o nome do Cliente: ");
				fila.add(ler.nextLine());
				
				break;
			case 2:
				System.out.println("\nNomes agendados: \n" + fila);
				break;
			case 3:
				if (fila.size()==0)
					System.out.println("A Fila está vazia!");
				else {
					ler.nextLine();
					System.out.println("\nNome: "+fila.remove()+"cliente atendido");
				}
				break;
			case 0:
				System.out.println("Obrigado por utilizar nossos serviços");
				break;
			default:
				System.out.println("Comando inválido");
				break;
			}

		} while (op != 0);

		ler.close();

	}

}
