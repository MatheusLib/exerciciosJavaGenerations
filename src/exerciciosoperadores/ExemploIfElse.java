package exerciciosoperadores;

import java.util.Scanner;

public class ExemploIfElse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float n1,n2,n3,diferenca;
		
		Scanner ler = new Scanner(System.in);
		
		do {
			System.out.println("\nEntre com o valor de A entre 0 a 10");
			n1 = ler.nextFloat();
			} while (n1<0||n1>10);

		System.out.println("\nEntre com o valor de B");
		n2 = ler.nextFloat();
		System.out.println("\nEntre com o valor de C");
		n3 = ler.nextFloat();//Entrei com as 3 notas
		
		diferenca = (n1+n2)-n3;
				
		if (diferenca == 0) {
			System.out.println("A Soma de A + B é Igual a C");
			
		}
		else if (diferenca<0) {
			System.out.println("A Soma de A + B é Menor do que C");
			
		}
		else if(diferenca>0) {
			System.out.println("A Soma de A + B é Maior do que C");
		}
		else {
			System.out.println("Valores não validos para a operação");
		}
		System.out.println("o resultado da operação é igual a "+diferenca);
		ler.close();

	}

}
