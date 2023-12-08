package exerciciosloops;

import java.util.Scanner;

public class OutroDoWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ler = new Scanner(System.in);
		int entrada,contagem=0;
		float soma=0f;
		System.out.println("\t Bem vindo ao programa de multiplos de 3");
		System.out.println("\nEsse programa  tem o intuito de verificar a média dos multiplos de 3");
		System.out.println("Para terminar o programa apenas é necessário que entre com o número 0");
		System.out.println("\nVamos começar?");
		
		do {
			System.out.println("Entre um número a sua escolha");
			entrada = ler.nextInt();
			if (entrada!=0&&entrada%3==0) {
				soma+=entrada;
				contagem++;
			}
		} while (entrada!=0);
		ler.close();
		System.out.println("A média de todos os números múltiplos de 3 é: "+(soma/contagem));
	}

}