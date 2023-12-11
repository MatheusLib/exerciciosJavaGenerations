package arrays;

import java.util.Scanner;

public class ExercicioVetor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int vetor [] = {2, 5, 1, 3, 4, 9, 7, 8, 10, 6};
		int procura, aux=-1;
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("entre o número que procura: ");
		procura = ler.nextInt();

		for (int i = 0; i < vetor.length; i++) {
			if (vetor[i]==procura) {
				aux = i;
			}
			
		}
		ler.close();

		if (aux ==-1)
			System.out.println("O número "+ procura +" não foi encontrado!");
		else
			System.out.println("O número "+ procura+" está localizado na posição: "+ aux);
	}

}
