package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		String[] estados = new String[3];
		Scanner sc = new Scanner(System.in);

		estados[0] = "AC";
		estados[1] = "BA";
		estados[2] = "CE";

		for (int i = 0; i < estados.length; i++) {
			System.out.println(estados[i]);
		}
		
		System.out.println("Qual sigla de estado deseja buscar? ");
		String buscaSigla = sc.nextLine();
		
		boolean encontrou = false;
		
		for(int i = 0; i < estados.length; i++) {
			String elemento = estados[i];
			if(elemento.equalsIgnoreCase(buscaSigla)) {
				encontrou = true;
				break;
			}
		}
		if(encontrou == true) {
			System.out.println("Encontrado o estado buscado.");
		}
		else {
			System.out.println("Não foi possível encontrar o estado desejado");
		}

		sc.close();
	}

}
