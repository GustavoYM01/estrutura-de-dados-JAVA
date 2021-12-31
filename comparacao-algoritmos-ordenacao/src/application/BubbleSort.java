package application;

public class BubbleSort {

	public static Resultado sort(int[] vetor) {
		long trocas = 0;

		// Bubble sort
		int aux;
		for (int i = 0; i < vetor.length; i++) {
			for (int j = i + 1; j < vetor.length; j++) {
				if (vetor[i] > vetor[j]) {
					aux = vetor[j];
					vetor[j] = vetor[i];
					vetor[i] = aux;
					trocas++;
				}
			}
		}
		return new Resultado(vetor, trocas);
	}
}
