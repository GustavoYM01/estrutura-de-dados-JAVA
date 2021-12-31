package application;

public class ProgramaClientes {

	public static void main(String[] args) {

		ListaLigada<Cliente> clientes = new ListaLigada<Cliente>();
		
		clientes.adicionar(new Cliente("Jão", "123"));
		clientes.adicionar(new Cliente("Juca", "345"));
		clientes.adicionar(new Cliente("Zé", "678"));
		
		System.out.println("Tamanho da lista: " + clientes.getTamanho());
		for (int i = 0; i < clientes.getTamanho(); i++) {
			System.out.println(clientes.get(i).getValor());
		}

	}

}
