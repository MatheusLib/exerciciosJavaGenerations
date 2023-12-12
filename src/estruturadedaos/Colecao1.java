package estruturadedaos;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Colecao1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Maneira de criar um List Completo, List é uma collection que vai fazer toda a manipulação dos dados através de uma estrutura de dados do tipo lista -(CRUD -  Create (criar), Read (ler), Update (atualizar) e Delete (apagar))
		List<Integer> minhaLista = new ArrayList<Integer>();
		// INTEGER é um objeto da classe Wrapper que vai substituir um tipo primitivo (int,double,float,etc)
		
		Scanner ler = new Scanner(System.in);
		
		minhaLista.add(2); //add -> Adiciona valores para o ArrayList
		minhaLista.add(3);
		minhaLista.add(4);
		minhaLista.add(6);
		minhaLista.add(1);
		minhaLista.add(22);
		
		for (Integer listaElementos : minhaLista) {
			System.out.println(listaElementos);
		}
		
		System.out.println("\nRemovendo um elemento da minha lista");
		System.out.println();
		minhaLista.remove(1);// Remove o elemento no indice 1 da minha lista, Não o valor 1
		
		for (Integer listaElementos : minhaLista) {
			System.out.println(listaElementos);
		}
		
		int primeiroElemento = minhaLista.get(0);// Pega o primeiro elemento da minha lista
		System.out.println("\nO primeiro elemento da minha lista é "+primeiroElemento);
		System.out.println();
		
		for (int i = 0; i < minhaLista.size(); i++) {
			System.out.println("\nelemento: "+minhaLista.get(i));// size() e get() são métodos por isso precisam de (), já o length é atributo
			Collections.sort(minhaLista);
			
			System.out.println("\n Depois de ordenado");
			System.out.println(minhaLista);
			System.out.println();
			
			Set<Integer> meuSet = new HashSet<Integer>();
			
			meuSet.add(4);
			meuSet.add(2);
			meuSet.add(1);
			meuSet.add(2);
			meuSet.add(0);
			meuSet.add(42);
			meuSet.add(2);
			meuSet.add(3);

			Iterator <Integer> iMeuSet = meuSet.iterator();
			
			while (iMeuSet.hasNext()) {
				System.out.println(iMeuSet.next());
				
			}
			minhaLista.add(2322);
			minhaLista.add(21);	
			
		}

	}

}
