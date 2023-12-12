package estruturadedaos;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class ExercicioSet {
	
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int entrada;
		HashSet<Integer> setNumeros = new HashSet<Integer>();
		
		do {
			System.out.println("Digite um número não repetido seu Set");
			entrada = ler.nextInt();
			setNumeros.add(entrada);
			
		} while (setNumeros.size()<10);
		
		Iterator <Integer> iSetNumeros = setNumeros.iterator();
		
		while (iSetNumeros.hasNext()) {
			System.out.println(iSetNumeros.next());
			
		}
		
	}

}
