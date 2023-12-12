package estruturadedaos;

import java.util.HashSet;
import java.util.Random;
import java.util.Scanner;

public class OutroSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<Integer> setProcura = new HashSet<Integer>();
		Scanner ler = new Scanner(System.in);
		
		for (int i = 0; i < 10; i++) {
			Random geranumeros = new Random();
			int teste = geranumeros.nextInt(0, 100);
			setProcura.add(teste);
		}
		
		System.out.println("Digite o número que você deseja encontrar: ");
		int numeroProcura = ler.nextInt();
		
		if (setProcura.contains(numeroProcura)) {
			System.out.println("O número "+numeroProcura+" foi encontrado!");
		}
		else {
			System.out.println("O número "+numeroProcura+" não foi encontrado!");
		}
		
		System.out.println("Os número do set eram: "+setProcura);

	}

}
