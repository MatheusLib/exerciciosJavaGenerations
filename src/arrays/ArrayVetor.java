package arrays;

import java.util.Scanner;

public class ArrayVetor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float media [] = new float[4];
		String nomesString [] = new String [4];
		float n1,n2,n3, mediaGeral, somaMedia = 0;
		
		Scanner ler = new Scanner(System.in);
		
		for (int i = 0; i < media.length; i++) {
			System.out.println("\nColoque as notas do aluno "+(i+1));
			System.out.println("Entre com a primeira nota");
			n1 = ler.nextFloat();
			System.out.println("Entre com a segunda nota");
			n2 = ler.nextFloat();
			System.out.println("Entre com a terceira nota");
			n3 = ler.nextFloat();
			
			media[i] = (n1+n2+n3)/3;
			somaMedia += media[i];
			
			System.out.println("A média do aluno "+(i+1)+" é "+media[i]);

		}		
		mediaGeral = somaMedia/4;
		System.out.println("\nA média geral é "+mediaGeral);
		ler.close();
	}

}
