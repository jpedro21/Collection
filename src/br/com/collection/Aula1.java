package br.com.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;

public class Aula1 {

	public static void main(String[] args) {
		
		List<String> palavras = new ArrayList<>();
		palavras.add("alura online");
		palavras.add("casa do código");
		palavras.add("caelum");
		
		//palavras.remove(1);
		Collections.sort(palavras);
		
		Consumer<String> consumidor = new ImprimeNaTela();

        palavras.forEach(consumidor);

	}

}
