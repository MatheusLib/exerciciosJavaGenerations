package estruturadedaos;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ExercicioArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ler = new Scanner(System.in);
		String entrada;
		ArrayList<String> listaCores = new ArrayList<>();
				
		do {
			System.out.println("Escreva uma cor para sua lista");
			entrada = ler.nextLine();
			listaCores.add(entrada);
			
		} while (listaCores.size()<5);
		
		System.out.println("Lista de cores: \n"+listaCores);
		Collections.sort(listaCores);
		System.out.println("Ordenar as cores: \n"+listaCores);

	}

}
