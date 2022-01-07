package grafo;

public class Program {

	public static void main(String[] args) {

		Grafo<String> grafo = new Grafo<String>();

		grafo.adicionarVertice("Jo�o");
		grafo.adicionarVertice("Maria");
		grafo.adicionarVertice("Ryu");
		grafo.adicionarVertice("Mia");
		
		grafo.adicionarAresta(2.0, "Jo�o", "Ryu");
		grafo.adicionarAresta(4.0, "Maria", "Mia");
		grafo.adicionarAresta(3.0, "Mia", "Jo�o");
		grafo.adicionarAresta(1.0, "Ryu", "Mia");
		grafo.adicionarAresta(3.0, "Maria", "Jo�o");
		
		grafo.buscaEmLargura();
		
	}

}
