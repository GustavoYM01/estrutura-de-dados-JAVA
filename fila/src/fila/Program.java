package fila;

public class Program {

	public static void main(String[] args) {

		Fila fila = new Fila();
		
		fila.adicionar("Jão");
		fila.adicionar("Zé");
		fila.adicionar("Juca");
		fila.adicionar("Ana");
		
		System.out.println("Primeiro da fila: " + fila.get());
		fila.remover();
		System.out.println("Novo primeiro da fila: " + fila.get());

	}

}
