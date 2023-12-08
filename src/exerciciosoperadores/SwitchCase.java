package exerciciosoperadores;

import java.util.Scanner;

public class SwitchCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int op, qtd;
		Scanner ler = new Scanner(System.in);
		
		System.out.println("\n\t\tMenu de lanchonete");
		System.out.println("\n1- Cachorro Quente\tR$ 10.00");
		System.out.println("\n2- X-Salada\tR$ 15.00");
		System.out.println("\n3- X-Bacon\tR$ 18.00");
		System.out.println("\n4- Bauru\tR$ 12.00");
		System.out.println("\n5- Refrigerante\tR$ 8.00");
		System.out.println("\n6- Suco de laranja\tR$ 13.00");
		System.out.println("\nFavor escolher entre as opções");
		op = ler.nextInt();
		
		System.out.println("Por gentileza, informar a quantidade que deseja");
		qtd = ler.nextInt();
		
		switch (op) {
		case 1: {
			System.out.println("\n1- Produto Cachorro Quente\tQuantidade: "+qtd+"\tValor Total: "+(qtd*10));
			break;
		}
		case 2: {
			System.out.println("\n2- Produto X-Salada\tQuantidade: "+qtd+"\tValor Total: "+(qtd*15));
			break;
		}
		case 3: {
			System.out.println("\n3- Produto X-Bacon\tQuantidade: "+qtd+"\tValor Total: "+(qtd*18));
			break;
		}
		case 4: {
			System.out.println("\n4- Produto Bauru\tQuantidade: "+qtd+"\tValor Total: "+(qtd*12));
			break;
		}
		case 5: {
			System.out.println("\n5- Produto Refrigerante\tQuantidade: "+qtd+"\tValor Total: "+(qtd*8));
			break;
		}
		case 6: {
			System.out.println("\n6- Produto Suco de laranja\tQuantidade: "+qtd+"\tValor Total: "+(qtd*13));
			break;
		}

		default:
			throw new IllegalArgumentException("Unexpected value: " + op);
		}
		ler.close();

	}

}
