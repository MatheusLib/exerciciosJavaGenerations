package Operadores;

import java.util.Scanner;

public class Media {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leia = new Scanner(System.in);
		float a,b,c,d;
		System.out.println("Digite primeira nota");
		a = leia.nextFloat();
		System.out.println("Digite segunda nota");
		b = leia.nextFloat();
		System.out.println("Digite terceira nota");
		c = leia.nextFloat();
		System.out.println("Digite quarta nota");
		d = leia.nextFloat();

		System.out.println("Média das notas é "+((a+b+c+d)/4));
		leia.close();
	}

}
