package br.com.collection;

public class TestaCurso {
	
	public static void main(String[] args) {
		
		Curso curso = new Curso("Aula de Collection", "Nava");
		
		curso.adiciona(new Aula("Trabalhando com ArrayList", 21));
		curso.adiciona(new Aula("Criando uma Aula", 20));
		curso.adiciona(new Aula("Modelando com colecoes", 24));
		
		System.out.println(curso.getAulas());
	}

}
