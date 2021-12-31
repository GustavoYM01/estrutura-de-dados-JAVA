package application;

public class Main {

	public static void main(String[] args) {

		int vetor[] = new int[1000000];

		for (int i = 0; i < vetor.length; i++) {
			vetor[i] = (int) Math.floor(Math.random() * vetor.length);
		}

		long inicio, fim;
		Resultado resultado;

//		System.out.println("Bubble Sort");
//
//		inicio = System.currentTimeMillis();
//		resultado = BubbleSort.sort(vetor.clone());
//		fim = System.currentTimeMillis();
//		System.out.println("Temp: " + (fim - inicio) + "ms");
//		System.out.println("Trocas: " + resultado.getTrocas());

		System.out.println("\nInsertion Sort");

		inicio = System.currentTimeMillis();
		resultado = InsertionSort.sort(vetor.clone());
		fim = System.currentTimeMillis();
		System.out.println("Temp: " + (fim - inicio) + "ms");
		System.out.println("Trocas: " + resultado.getTrocas());

		System.out.println("\nHeap Sort");

		inicio = System.currentTimeMillis();
		resultado = HeapSort.sort(vetor.clone());
		fim = System.currentTimeMillis();
		System.out.println("Temp: " + (fim - inicio) + "ms");
		System.out.println("Trocas: " + resultado.getTrocas());
		
		System.out.println("\nQuick Sort");

		inicio = System.currentTimeMillis();
		resultado = QuickSort.sort(vetor.clone(), 0, vetor.length);
		fim = System.currentTimeMillis();
		System.out.println("Temp: " + (fim - inicio) + "ms");
		System.out.println("Trocas: " + resultado.getTrocas());
		
		System.out.println("\nSelection Sort");

		inicio = System.currentTimeMillis();
		resultado = SelectionSort.sort(vetor.clone());
		fim = System.currentTimeMillis();
		System.out.println("Temp: " + (fim - inicio) + "ms");
		System.out.println("Trocas: " + resultado.getTrocas());
		
		System.out.println("\nShell Sort");

		inicio = System.currentTimeMillis();
		resultado = ShellSort.sort(vetor.clone());
		fim = System.currentTimeMillis();
		System.out.println("Temp: " + (fim - inicio) + "ms");
		System.out.println("Trocas: " + resultado.getTrocas());
	}

}
