package exerciciosloops;

import java.util.Scanner;

public class OutroDeFor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ler = new Scanner(System.in);
		int impar=0, par=0, entrada;
		
		System.out.println("\tBem vindo ao programa de separação de par e impar");
		System.out.println("\nVocê entrará com 10 número distintos");
		System.out.println("\nE o programa informará a quantidade pares e impares");
		System.out.println("\nEntão vamos começar");
		
		for (int i = 0; i < 10; i++) {
			System.out.println("\nEntre com o próximo número");
			entrada = ler.nextInt();
			if (entrada%2==0) {
				par++;
				
			} else {
				impar++;

			}

		}
		System.out.println("\nTotal de números pares: "+par);
		System.out.println("\nTotal de números ímpares: "+impar);
		ler.close();
		
	}

}
