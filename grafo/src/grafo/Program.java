package grafo;

public class Program {

	public static void main(String[] args) {

		Grafo<String> grafo = new Grafo<String>();

		grafo.adicionarVertice("João");
		grafo.adicionarVertice("Maria");
		grafo.adicionarVertice("Ryu");
		grafo.adicionarVertice("Mia");
		
		grafo.adicionarAresta(2.0, "João", "Ryu");
		grafo.adicionarAresta(4.0, "Maria", "Mia");
		grafo.adicionarAresta(3.0, "Mia", "João");
		grafo.adicionarAresta(1.0, "Ryu", "Mia");
		grafo.adicionarAresta(3.0, "Maria", "João");
		
		grafo.buscaEmLargura();
		
	}

}
