package br.com.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Aula2 {
	
	public static void main(String[] args) {
		
		Aula a1 = new Aula("Revistando as ArrayLists", 21);
        Aula a2 = new Aula("Listas de objetos", 20);
        Aula a3 = new Aula("Relacionamento de listas e objetos", 15);

        List<Aula> aulas = new ArrayList<>();
        
        aulas.add(a1);
        aulas.add(a2);
        aulas.add(a3);
        
        Collections.sort(aulas);
        aulas.sort(Comparator.comparing(Aula::getTempo));
        
        System.out.println(aulas);
	}
}
