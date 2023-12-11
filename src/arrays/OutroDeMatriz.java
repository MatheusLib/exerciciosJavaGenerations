package arrays;

import java.util.Scanner;

public class OutroDeMatriz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float numeros [][] = new float[10][4];
		float mediaAlunos [] = new float[10];
		float somaMedia=0,linha,coluna;
		Scanner ler = new Scanner(System.in);

		
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 4; j++) {
				System.out.println("Entre com a nota do aluno "+(i+1)+" no "+(j+1)+" bimestre");
				numeros[i][j] = ler.nextFloat();
				somaMedia += numeros[i][j];
				
				if (j==3) {
					mediaAlunos[i] = somaMedia/4;
					somaMedia=0;
				}
			}
		}
		System.out.println("Média de cada aluno");
		for (int i = 0; i < mediaAlunos.length; i++) {
			System.out.println("\nAluno "+(i+1)+" a média é "+mediaAlunos[i]);
		}

	}

}