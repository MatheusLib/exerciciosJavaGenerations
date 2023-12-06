package Operadores;

import java.util.Scanner;

public class OperadoresAritmeticos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leia = new Scanner(System.in);
		
		int x,y,resul;
		
		System.out.println("\nDigite o Salário: ");
		x = leia.nextInt();
		System.out.println("\nDigite o Abono: ");
		y = leia.nextInt();
		
		resul = x+y;// Soma de salario e abono
		
		System.out.println("\nNovo Salario: "+ resul);
		
		
		leia.close();

	}

}
