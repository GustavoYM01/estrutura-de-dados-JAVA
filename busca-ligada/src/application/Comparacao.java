package application;

import java.util.ArrayList;

public class Comparacao {

	public static void main(String[] args) {

		ListaLigada<Integer> lista = new ListaLigada<Integer>();

		ArrayList<Integer> vetor = new ArrayList<Integer>();

		// COMPARAÇÃO:

		// ADICIONAR ELEMENTOS
		
		// VETOR
		int limite = 1000000;
		long tempoInical = System.currentTimeMillis();
		long tempoFinal;
		for (int i = 0; i < limite; i++) {
			vetor.add(i);
		}
		tempoFinal = System.currentTimeMillis();
		System.out.println("Adicionou " + limite + 
				" elementos no vetor");
		System.out.println(tempoFinal - tempoInical + "ms");

		// LISTA
		tempoInical = System.currentTimeMillis();
		for (int i = 0; i < limite; i++) {
			lista.adicionar(i);
		}
		tempoFinal = System.currentTimeMillis();
		System.out.println("\n\nAdicionou " + limite + 
				" elementos na lista");
		System.out.println(tempoFinal - tempoInical + "ms");
		
		// LER VALORES
		
		// VETOR
		tempoInical = System.currentTimeMillis();
		for(int i = 0; i < vetor.size(); i++) {
			vetor.get(i);
		}
		tempoFinal = System.currentTimeMillis();
		System.out.println("\n\nTempo de leitura do vetor");
		System.out.println(tempoFinal - tempoInical + "ms");
		
		// LISTA
				tempoInical = System.currentTimeMillis();
				IteratorListaLigada<Integer> iterator = lista.getIterator();
				while(iterator.temProximo()) {
					iterator.getProximo();
				}
				tempoFinal = System.currentTimeMillis();
				System.out.println("\n\nTempo de leitura da lista");
				System.out.println(tempoFinal - tempoInical + "ms");

	}

}
