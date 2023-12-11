package arrays;

import java.util.Scanner;

public class OutroDeVetor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int vetor [] = new int[10];
		float mediaGeral, somaMedia = 0;
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Coloque 10 números dentro do vetor");
		
		for (int i = 0; i < vetor.length; i++) {
			System.out.println("Entre com o próximo numero");
			vetor[i] = ler.nextInt();
			somaMedia += vetor[i];
		}
		System.out.println("Elementos nos índices ímpares: ");
		for (int i = 0; i < vetor.length; i++) {
			if (i%2 !=0)
			System.out.println(vetor[i]);
		}
		System.out.println("Elementos pares: ");
		for (int i = 0; i < vetor.length; i++) {
			if (vetor[i]%2 ==0)
			System.out.println(vetor[i]);
		}

		System.out.println("\nA soma total dos número é "+somaMedia);
		mediaGeral = somaMedia/10;
		System.out.println("\nA média geral é "+mediaGeral);
		ler.close();
	}

}
