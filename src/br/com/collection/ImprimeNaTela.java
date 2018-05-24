package br.com.collection;

import java.util.function.Consumer;

public class ImprimeNaTela implements Consumer<String> {

	@Override
	public void accept(String s) {
		System.out.println(s);
	}

	
}
