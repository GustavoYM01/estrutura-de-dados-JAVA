package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		int[] vetor = new int[100000];

		for (int i = 0; i < vetor.length; i++) {
			vetor[i] = i * 2;
//			System.out.println(vetor[i]);
		}

		System.out.print("Qual número deseja procurar? ");
		Scanner sc = new Scanner(System.in);
		int buscado = sc.nextInt();
		sc.nextLine();

		int contador = 0;
		boolean achou = false;
		int inicio = 0;
		int fim = vetor.length - 1;
		int meio;
		while (inicio <= fim) {
			meio = (int) ((inicio + fim) / 2);
			contador++;
			if (vetor[meio] == buscado) {
				achou = true;
				break;
			} else if (vetor[meio] < buscado) {
				inicio = meio + 1;
			} else {
				fim = meio - 1;
			}
		}
		System.out.println("Quantidade de testes: " + contador);
		if(achou) {
			System.out.println("Achou");
		} else {
			System.out.println("Não achou");
		}

		sc.close();
	}

}
