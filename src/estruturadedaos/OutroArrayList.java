package estruturadedaos;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class OutroArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> listaProcura = new ArrayList<Integer>();
		Scanner ler = new Scanner(System.in);
		boolean indice = false;
		
		
		for (int i = 10; i > 0; i--) {
			Random geranumeros = new Random();
			int teste = geranumeros.nextInt(10, 30);
			listaProcura.add(teste);
		}
		
		System.out.println("Digite o número que você deseja encontrar: ");
		int numeroProcura = ler.nextInt();
		
		for (Integer listaElementos : listaProcura) {
			if (numeroProcura == listaElementos) {
				System.out.println("O número "+numeroProcura+" está localizado na posição: "+listaProcura.indexOf(listaElementos));
				indice =true;
			}
		}
		if (!indice)
			System.out.println("O número "+numeroProcura+" não foi encontrado!");	
		System.out.println("Os número da lista eram: "+listaProcura);

	}

}
