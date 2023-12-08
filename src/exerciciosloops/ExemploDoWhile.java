package exerciciosloops;

import java.util.Scanner;

public class ExemploDoWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ler = new Scanner(System.in);
		int entrada,soma=0;
		System.out.println("\t Bem vindo ao programa de soma de números positivos");
		System.out.println("\nEsse programa  tem o intuito de somar os números inteiros e positivos");
		System.out.println("Para terminar o programa apenas é necessário que entre com o número 0");
		System.out.println("\nVamos começar?");
		
		do {
			System.out.println("Entre um número a sua escolha");
			entrada = ler.nextInt();
			if (entrada>0) {
				soma+=entrada;
			}
		} while (entrada!=0);
		ler.close();
		System.out.println("A soma dos números positivos é: "+soma);
	}

}
