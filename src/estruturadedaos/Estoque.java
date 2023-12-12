package estruturadedaos;

import java.util.ArrayList;
import java.util.Scanner;

public class Estoque {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int op;
		
		Scanner ler = new Scanner(System.in);
		
		ArrayList<String> estoque = new ArrayList<>();
		
		do {
			System.out.println("\n---------------------------------");
			System.out.println("\n\t\tMenu do Estoque");
			System.out.println("\n(1) Adicionar Produtos ao Estoque");
			System.out.println("\n(2) Mostrar Produtos do Estoque");
			System.out.println("\n(3) Atualizar Produtos do Estoque");
			System.out.println("\n(4) Remover Produtos do Estoque");
			System.out.println("\n(0) Sair do programa");
			System.out.println("\n---------------------------------");
			System.out.println("\nDigite sua opção");

			op = ler.nextInt();
			
			switch (op) {
			case 1:
				
				ler.nextLine();
				System.out.println();
				String produto = ler.nextLine();
				produto.toLowerCase();
				estoque.add(produto);		
				break;
			case 2:
				System.out.println("Os produtos do estoque são: ");
				System.out.println(estoque);
				break;
			case 3:
				ler.nextLine();
				System.out.println("\nDigite o produto que deseja atualizar");
				String verifica = ler.nextLine();
				verifica.toLowerCase();
		
				System.out.println("\nDigite o produto que entrará no lugar");
				String novo = ler.nextLine();
				
				if(estoque.contains(verifica)) {
					estoque.remove(verifica);
					estoque.add(novo);
				}
				else
					System.out.println("Produto não existe no estoque");
				System.out.println(estoque);
				break;
				
			case 4:
				ler.nextLine();
				System.out.println("\nDigite o produto que deseja atualizar");
				String removerP = ler.nextLine();
				if(estoque.contains(removerP)) 
					estoque.remove(removerP);
				else
					System.out.println("Produto não existe no estoque");
				System.out.println(estoque);
				break;
				
			default:
				break;
			}
			 

		} while (op !=0);

	}

}
