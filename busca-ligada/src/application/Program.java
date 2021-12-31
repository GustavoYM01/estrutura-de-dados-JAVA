package application;

public class Program {

	public static void main(String[] args) {

		ListaLigada<String> lista = new ListaLigada<String>();
		lista.adicionar("AC");
		lista.adicionar("BA");
		lista.adicionar("SP");
		lista.adicionar("DF");
		lista.adicionar("CE");
		System.out.println("Tamanho da lista: " + lista.getTamanho());
		System.out.println("Primeiro: " + lista.getPrimeiro().getValor());
		System.out.println("Ultimo: " + lista.getUltimo().getValor());
		for (int i = 0; i < lista.getTamanho(); i++) {
			System.out.println(lista.get(i).getValor());
		}
		lista.remover("AC");
		lista.remover("BA");
		lista.remover("SP");
		lista.remover("DF");
		lista.remover("CE");
		lista.adicionar("RJ");
		System.out.println();
		System.out.println("Tamanho da lista: " + lista.getTamanho());
		for (int i = 0; i < lista.getTamanho(); i++) {
			System.out.println(lista.get(i).getValor());
		}
	}

}
