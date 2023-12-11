package arrays;

import java.util.Scanner;

public class ArrayMatriz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numeros [][] = new int[3][2];
		int contPares =0, somaImpares=0,linha,coluna;
		Scanner ler = new Scanner(System.in);

		
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 2; j++) {
				System.out.println("Entre com o número da linha "+(i+1)+" coluna "+(j+1));
				numeros[i][j] = ler.nextInt();
				
				if (numeros[i][j] %2 == 0)
					contPares++;
				else
					somaImpares += numeros[i][j];
				
			}
		}
		System.out.println("\nEu tenho "+contPares+" de números pares");
		System.out.println("\nA somatória dos números impares é "+somaImpares+"\n\n");
		System.out.println(numeros);
		ler.close();
	}

}
