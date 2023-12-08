package exerciciosloops;

import java.util.Scanner;

public class ExemploWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ler = new Scanner(System.in);
		int menordeidade=0,maiordeidade=0, idade=1;
		System.out.println("\t Bem vindo ao programa de contagem de pessoas dependentes");
		System.out.println("\nEsse programa  tem o intuito de contar \no número de pessoas cujo a idade seja menor que 21 anos e maior que 50 anos");
		System.out.println("Para terminar o programa apenas é necessário que entre com uma idade negativa");
		System.out.println("\nvamos começar?");
		
		while (idade>=0) {
			System.out.println("\nEntre a idade a ser contabilizada");
			idade = ler.nextInt();
			if (idade<21&&idade>=0) {
				menordeidade++;				
			}
			
			else if(idade>50){
				maiordeidade++;
			}
			
		}
		ler.close();
		System.out.println("\nTotal de pessoas menores de 21 anos: "+menordeidade);
		System.out.println("\nTotal de pessoas maiores de 50 anos: "+maiordeidade);
		
	}

}
