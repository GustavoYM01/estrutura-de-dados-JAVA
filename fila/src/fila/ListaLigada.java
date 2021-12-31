package fila;

public class ListaLigada<TIPO> {

	private Elemento<String> primeiro;
	private Elemento<String> ultimo;
	private int tamanho;

	public ListaLigada() {
		this.tamanho = 0;
	}

	public Elemento<String> getPrimeiro() {
		return primeiro;
	}

	public void setPrimeiro(Elemento<String> primeiro) {
		this.primeiro = primeiro;
	}

	public Elemento<String> getUltimo() {
		return ultimo;
	}

	public void setUltimo(Elemento<String> ultimo) {
		this.ultimo = ultimo;
	}

	public int getTamanho() {
		return tamanho;
	}

	public void setTamanho(int tamanho) {
		this.tamanho = tamanho;
	}

	public void adicionar(String novoValor) {
		Elemento<String> novoElemento = new Elemento<String>(novoValor);
		if (primeiro == null && ultimo == null) {
			this.primeiro = novoElemento;
			this.ultimo = novoElemento;
		} else {
			this.ultimo.setProximo(novoElemento);
			this.ultimo = novoElemento;
		}
		this.tamanho++;
	}

	public void remover(String valorProcurado) {
		Elemento<String> anterior = null;
		Elemento<String> atual = this.primeiro;
		for (int i = 0; i < this.getTamanho(); i++) {
			if (atual.getValor().equals(valorProcurado)) {
				if (this.tamanho == 1) {
					this.primeiro = null;
					this.ultimo = null;
				} else if (atual == primeiro) {
					this.primeiro = atual.getProximo();
					atual.setProximo(null);
				} else if (atual == ultimo) {
					this.ultimo = anterior;
					anterior.setProximo(null);
				} else {
					anterior.setProximo(atual.getProximo());
					atual = null;
				}
				this.tamanho--;
				break;
			}
			anterior = atual;
			atual = atual.getProximo();
		}
	}

	public Elemento<String> get(int posicao) {
		Elemento<String> atual = this.primeiro;
		for (int i = 0; i < posicao; i++) {
			if (atual.getProximo() != null) {
				atual = atual.getProximo();
			}
		}
		return atual;
	}

//	public IteratorListaLigada<TIPO> getIterator() {
//		return new IteratorListaLigada<TIPO>(this.primeiro);
//	}
}
