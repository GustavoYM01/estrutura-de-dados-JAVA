package pilha;

public class Elemento<TIPO> {
	
	private String valor;
	private Elemento<String> proximo;
	
	public Elemento(String novoValor) {
		this.valor = novoValor;
	}
	public String getValor() {
		return valor;
	}
	public void setValor(String valor) {
		this.valor = valor;
	}
	public Elemento<String> getProximo() {
		return proximo;
	}
	public void setProximo(Elemento<String> proximo) {
		this.proximo = proximo;
	}
}
