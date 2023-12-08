package exerciciosoperadores;

import java.util.Scanner;

public class DiferencaDeProdutos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				Scanner leia = new Scanner(System.in);
				float a,b,c,d;
				System.out.println("Digite primeiro número:");
				a = leia.nextFloat();
				System.out.println("Digite segundo número:");
				b = leia.nextFloat();
				System.out.println("Digite terceiro número:");
				c = leia.nextFloat();
				System.out.println("Digite quarto número:");
				d = leia.nextFloat();

				System.out.println("A diferença de produtos é "+((a*b)-(c*d)));
				leia.close();
	}

}
