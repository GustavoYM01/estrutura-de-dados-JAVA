package arvoreBinaria;

@SuppressWarnings("rawtypes")
public class Arvore<TIPO extends Comparable> {

	private Elemento<TIPO> raiz;

	public Arvore() {
		this.raiz = null;
	}

	@SuppressWarnings("unchecked")
	public void adicionar(TIPO valor) {
		Elemento<TIPO> novoElemento = new Elemento<TIPO>(valor);
		if (raiz == null) {
			this.raiz = novoElemento;
		} else {
			Elemento<TIPO> atual = this.raiz;
			while (true) {
				if (novoElemento.getValor().compareTo(atual.getValor()) == -1) {
					if (atual.getEsquerda() != null) {
						atual = atual.getEsquerda();
					} else {
						atual.setEsquerda(novoElemento);
						break;
					}
				} else { // se for maior ou igual
					if (atual.getDireita() != null) {
						atual = atual.getDireita();
					} else {
						atual.setDireita(novoElemento);
						break;
					}
				}
			}
		}
	}

	public Elemento<TIPO> getRaiz() {
		return raiz;
	}

	public void emOrdem(Elemento<TIPO> atual) {
		if (atual != null) {
			emOrdem(atual.getEsquerda());
			System.out.print(atual.getValor() + " ");
			emOrdem(atual.getDireita());
		}
	}

	public void preOrdem(Elemento<TIPO> atual) {
		if (atual != null) {
			System.out.print(atual.getValor() + " ");
			preOrdem(atual.getEsquerda());
			preOrdem(atual.getDireita());
		}
	}

	public void posOrdem(Elemento<TIPO> atual) {
		if (atual != null) {
			posOrdem(atual.getEsquerda());
			posOrdem(atual.getDireita());
			System.out.print(atual.getValor() + " ");
		}
	}

	@SuppressWarnings("unchecked")
	public boolean remover(TIPO valor) {
		// buscar o elemento na árvore
		Elemento<TIPO> atual = this.raiz;
		Elemento<TIPO> paiAtual = null;
		while (atual != null) {
			if (atual.getValor().equals(valor)) {
				break;
			} else if (valor.compareTo(atual.getValor()) == -1) {
				// valor é menor do que o atual
				paiAtual = atual;
				atual = atual.getEsquerda();
			} else {
				// valor é maior do que o atual
				paiAtual = atual;
				atual = atual.getDireita();
			}
		}
		// verifica se o elemento existe
		if (atual != null) {
			// elemento têm 2 filhos ou somente filho à direita
			if (atual.getDireita() != null) {
				
				Elemento<TIPO> substituto = atual.getDireita();
				Elemento<TIPO> paiSubstituto = atual;
				while(substituto.getEsquerda() != null) {
					paiSubstituto = substituto;
					substituto = substituto.getEsquerda();
				}
				substituto.setEsquerda(atual.getEsquerda());
				if(paiAtual != null) {
					if(atual.getValor().compareTo(paiAtual.getValor()) == -1) { // atual < paiAtual
						paiAtual.setEsquerda(substituto);
					}
					else {
						paiAtual.setDireita(substituto);
					}
				}
				else { // se não há paiAtual, então é raiz
					this.raiz = substituto;
				}
				// removeu o elemento da árvore
				if(substituto.getValor().compareTo(paiSubstituto.getValor()) == -1) { // substituto < paiSubstituto
					paiSubstituto.setEsquerda(null);
				}
				else {
					paiSubstituto.setDireita(null);
				}

			} else if (atual.getEsquerda() != null) { // tem filho só à esquerda
				Elemento<TIPO> substituto = atual.getEsquerda();
				Elemento<TIPO> paiSubstituto = atual;
				while(substituto.getDireita() != null) {
					paiSubstituto = substituto;
					substituto = substituto.getDireita();
				}
				if(paiAtual != null) {
					if(atual.getValor().compareTo(paiAtual.getValor()) == -1) { // atual < paiAtual
						paiAtual.setEsquerda(substituto);
					}
					else {
						paiAtual.setDireita(substituto);
					}
				}
				else { // se for a raiz
					this.raiz = substituto;
				}
				// removeu o elemento da árvore
				if(substituto.getValor().compareTo(paiSubstituto.getValor()) == -1) { // substituto < paiSubstituto
					paiSubstituto.setEsquerda(null);
				}
				else {
					paiSubstituto.setDireita(null);
				}
			}
			else { // não tem filho
				if(paiAtual != null) {
					if(atual.getValor().compareTo(paiAtual.getValor()) == -1) { // atual < paiAtual
						paiAtual.setEsquerda(null);
					}
					else {
						paiAtual.setDireita(null);
					}
				}
				else { // é raiz
					this.raiz = null;
				}
			}
			return true;
		} else {
			return false;
		}
	}
}