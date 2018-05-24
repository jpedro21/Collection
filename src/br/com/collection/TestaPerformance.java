package br.com.collection;

import java.util.HashSet;
import java.util.Set;

public class TestaPerformance {

    public static void main(String[] args) {

        Set<Integer> numeros = new HashSet<Integer>();

        long inicio = System.currentTimeMillis();

        for (int i = 1; i <= 50000; i++) {
            numeros.add(i);
        }

        for (Integer numero : numeros) {
            numeros.contains(numero);
        }

        long fim = System.currentTimeMillis();

        long tempoDeExecucao = fim - inicio;
                
        System.out.println("Tempo gasto: " + tempoDeExecucao);
        

    }

}
