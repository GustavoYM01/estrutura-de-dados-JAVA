package selectionSort;

public class Program {

	public static void main(String[] args) {

		int[] vetor = new int[10];

		System.out.println("Vetor desornedado:");
		for (int i = 0; i < vetor.length; i++) {
			vetor[i] = (int) (Math.random() * vetor.length);
			System.out.print(vetor[i] + " ");
		}

		// Selection sort
		int posicao_menor, aux;

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
		}
		
		System.out.println("\n\nVetor ornedado:");
		for (int i = 0; i < vetor.length; i++) {
			System.out.print(vetor[i] + " ");
		}

	}

}
