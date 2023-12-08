package comecandojava;// Estou indicando o package onde esta a minha class

import java.util.Scanner;

public class OlaMundo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Dentro dos parenteses ficam os argumentos do metodo
		// as chaves [] significam que e um vetor do tipo string
		Scanner leia = new Scanner(System.in);// o leia e um objeto do tipo scanner e puxa da biblioteca java.util.Scanner
		//Metodo e mesma coisa que funcao
		//System.in e o argumento
		final int numero =3;
		String nome = "Matheus Libanio";
		int idade = 26;
		float altura = (float) 1.73;
		float testedealtura = 1.73f;// as duas maneiras servem
		
		//
		
		System.out.println("\n\tMeu nome: "+ nome+ "\n\tIdade: "+idade+"\n\tAltura: "+altura+ "\n\tOutras informacoes: "+numero+testedealtura);
		System.out.println("\n\tEntre com um novo nome");
		nome = leia.nextLine();//metodo com retorno
		System.out.println("\n\tEntre com uma nova idade");
		idade = leia.nextInt();//metodo com retorno
		System.out.println("\n\tEntre com uma nova altura");
		altura = leia.nextFloat();//metodo com retorno
		System.out.println("\n\tMeu nome: "+ nome+ "\n\tIdade: "+idade+"\n\tAltura: "+altura);
		leia.close();

	}

}
