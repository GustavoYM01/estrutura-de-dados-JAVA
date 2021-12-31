package application;

public class SelectionSort {
	public static Resultado sort(int[] vetor) {
		// Selection sort
		int posicao_menor, aux;
		long trocas = 0;

		for (int i = 0; i < vetor.length; i++) {
			posicao_menor = i;
			for (int j = i + 1; j < vetor.length; j++) {
				if (vetor[j] < vetor[posicao_menor]) {
					posicao_menor = j;
				}
			}
			aux = vetor[posicao_menor];
			vetor[posicao_menor] = vetor[i];
			vetor[i] = aux;
			trocas++;
		}
		return new Resultado(vetor, trocas);
	}
}
