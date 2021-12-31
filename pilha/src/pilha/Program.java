package pilha;

public class Program {

	public static void main(String[] args) {

		Pilha pilha = new Pilha();

		pilha.adicionar("C");
		pilha.adicionar("F");
		pilha.adicionar("A");
		pilha.adicionar("Z");

		System.out.println("Topo: " + pilha.get());

		pilha.remover();

		System.out.println("Novo topo: " + pilha.get());

		pilha.remover();

		System.out.println("Novo topo: " + pilha.get());

	}

}
