package exerciciosoperadores;

import java.security.DrbgParameters.NextBytes;
import java.util.Scanner;

public class Cargoswitch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String nome;
		int op;
		float salario;

		Scanner ler = new Scanner(System.in);
		
		System.out.println("Entre um nome: ");
		nome = ler.nextLine();
		System.out.println("\n\t\tMenu de lanchonete");
		System.out.println("\n1- Gerente");
		System.out.println("\n2- Vendedor");
		System.out.println("\n3- Supervisor");
		System.out.println("\n4- Motorista");
		System.out.println("\n5- Estoquista");
		System.out.println("\n6- Técnico de TI");
		System.out.println("\nFavor escolher entre as opções");
		op = ler.nextInt();
		System.out.println("Entre o seu salário: ");
		salario = ler.nextFloat();

		switch (op) {
		case 1: {
			System.out.println("\n1- Nome: "+nome+"\tCargo : Gerente\tSalario reajustado: "+(salario*1.1));
			break;
		}
		case 2: {
			System.out.println("\n1- Nome: "+nome+"\tCargo : Vendedor\tSalario reajustado: "+(salario*1.07));
			break;
		}
		case 3: {
			System.out.println("\n1- Nome: "+nome+"\tCargo : Supervisor\tSalario reajustado: "+(salario*1.09));
			break;
		}
		case 4: {
			System.out.println("\n1- Nome: "+nome+"\tCargo : Motorista\tSalario reajustado: "+(salario*1.06));
			break;
		}
		case 5: {
			System.out.println("\n1- Nome: "+nome+"Cargo : Estoquista\tSalario reajustado: "+(salario*1.05));
			break;
		}
		case 6: {
			System.out.println("\n1- Nome: "+nome+"Cargo : Técnico de TI\tSalario reajustado: "+(salario*1.08));
			break;
		}
		
		default:
			throw new IllegalArgumentException("Unexpected value: " + op);
		}
		ler.close();


	}

}
