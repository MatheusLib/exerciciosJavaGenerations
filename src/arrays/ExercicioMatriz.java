package arrays;

import java.util.Scanner;

public class ExercicioMatriz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numeros [][] = new int[3][3];
		int digP =0, digS=0;
		//Testando Arredondamento
		double a=9.8, b=6.7, somaab;
		Scanner ler = new Scanner(System.in);

		
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.println("Entre com o número da linha "+(i+1)+" coluna "+(j+1));
				numeros[i][j] = ler.nextInt();
				
				if (i==j)
					digP += numeros[i][j];	
				if (i+j == 2)
					digS += numeros[i][j];
			}
		}
		System.out.println("\nElementos da Diagonal Principal:\n"+numeros[0][0]+"\t"+numeros[1][1]+"\t"+numeros[2][2]);
		System.out.println("\nElementos da Diagonal Secundaria:\n"+numeros[0][2]+"\t"+numeros[1][1]+"\t"+numeros[2][0]);
		
		System.out.println();
		System.out.println("\nSoma dos Elementos da Diagonal Principal é : "+digP);
		System.out.println("\nSoma dos Elementos da Diagonal Secundária é : "+digS);
		
		somaab = (a+b)/3;
		System.out.printf("\nSoma : %.2f",somaab);
		ler.close();
	}

}
