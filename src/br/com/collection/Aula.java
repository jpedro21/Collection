package br.com.collection;

public class Aula implements Comparable<Aula> {
	
	public String titulo;
	private Integer tempo;
	
	public Aula(String titulo, Integer tempo) {
		super();
		this.titulo = titulo;
		this.tempo = tempo;
	}
	
	public String getTitulo() {
		return titulo;
	}
	
	public Integer getTempo() {
		return tempo;
	}
	
	@Override
	public String toString() {
		
		return "[Aula: " + this.titulo + ","  + "Tempo: " + this.tempo + "]";
	}

	@Override
	public int compareTo(Aula outraAula) {
		
		return this.titulo.compareTo(outraAula.titulo);
	}
	

}
