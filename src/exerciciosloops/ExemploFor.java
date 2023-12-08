package exerciciosloops;

import java.util.Scanner;

public class ExemploFor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ler = new Scanner(System.in);
		int num1=0, num2=0;
		
		System.out.println("\tBem vindo ao programa de múltiplos de 3 e 5");
		System.out.println("\nVocê entrará com 2 números limitantes de um intervalo");
		System.out.println("\nE o programa informará todos os número que são simultaneamente divisiveis por 3 e 5");
		System.out.println("Então vamos começar");
		
		while (num1>=num2) {
			
		System.out.println("\nEntre o menor número do intervalo(Limite inferior)");
		num1 = ler.nextInt();
		System.out.println("\nEntre o maior número do intervalo(Limite superior)");
		num2 = ler.nextInt();
		if (num1>=num2)		{
			System.out.println("Intervalo inválido, vamos tentar de novo");
			}
		}
		
		for (int i = num1; i <= num2; i++) {
			if (i%3==0&&i%5==0) {
				System.out.println(i+" é multiplo de 3 e 5");				
			};
			
		}
		ler.close();

	}

}
