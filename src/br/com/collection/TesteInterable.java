package br.com.collection;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class TesteInterable {
	
	public static void main(String[] args) {
		
		List<Aula> listAula = new LinkedList<Aula>();
		
		listAula.add(new Aula("Trabalhando com ArrayList", 21));
		listAula.add(new Aula("Criando uma Aula", 20));
		listAula.add(new Aula("Modelando com colecoes", 24));
		
		Iterator<Aula> iterador = listAula.iterator();
		
		while(iterador.hasNext()) {
			
			System.out.println(iterador.next());
		}
	}

}
