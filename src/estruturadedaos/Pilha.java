package estruturadedaos;

import java.util.Stack;

public class Pilha {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<String> pilha = new Stack<String>();
		pilha.push("Prato Verde");
		pilha.push("Prato Azul");
		pilha.push("Prato Vermelho");
		pilha.push("Prato Amarelo");
		pilha.push("Prato Azul");
		
		System.out.println("Elementos da pilha: "+pilha);
		
		System.out.println("\nRetirar Elementos: "+pilha.pop());
		System.out.println("\nRetirar Elementos: "+pilha.pop());

		
		System.out.println("Elementos da pilha: "+pilha);


	}

}
