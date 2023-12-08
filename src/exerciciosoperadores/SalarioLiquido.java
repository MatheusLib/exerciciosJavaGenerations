package exerciciosoperadores;

import java.util.Scanner;

public class SalarioLiquido {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leia = new Scanner(System.in);
		float a,b,c,d;
		System.out.println("Digite Salário Bruto");
		a = leia.nextFloat();
		System.out.println("Digite Adicional Noturno");
		b = leia.nextFloat();
		System.out.println("Digite Horas Extras");
		c = leia.nextFloat();
		System.out.println("Digite Descontos");
		d = leia.nextFloat();

		System.out.println("Salário Liquído é "+(a+b+c*5-d));
		leia.close();

	}

}
