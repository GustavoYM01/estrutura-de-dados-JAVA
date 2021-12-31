package fila;

public class Fila {

	private ListaLigada<String> lista;
	
	public Fila() {
		this.lista = new ListaLigada<String>();
	}
	
	public void adicionar(String novoValor) {
		this.lista.adicionar(novoValor);
	}
	
	public void remover() {
		this.lista.remover(this.get());
	}
	
	public String get() {
		return this.lista.getPrimeiro().getValor();
	}	
}