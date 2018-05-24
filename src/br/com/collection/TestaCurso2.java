package br.com.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class TestaCurso2 {
	
	public static void main(String[] args) {
		
		Curso curso = new Curso("Aula de Collection", "Nava");
		
		curso.adiciona(new Aula("Trabalhando com ArrayList", 21));
		curso.adiciona(new Aula("Criando uma Aula", 20));
		curso.adiciona(new Aula("Modelando com colecoes", 24));
		
		List<Aula> aulas = new ArrayList<>(curso.getAulas());
		
		Collections.sort(aulas);
		
		System.out.println(aulas);
		
		System.out.println("A soma das aulas: " + curso.getTempoTotal());
		
		System.out.println(curso);
		
		Set<Aula> aulasSet = new HashSet<>();
		Aula a1 = new Aula("a", 1);
		aulasSet.add(a1);
		aulasSet.add(new Aula("b", 2));
		
		System.out.println(aulasSet.contains(a1));
		
	}

}
