package arvoreBinaria;

public class Program {

	public static void main(String[] args) {

		Arvore<Integer> arvore = new Arvore<Integer>();
		arvore.adicionar(10);
		arvore.adicionar(8);
		arvore.adicionar(5);
		arvore.adicionar(9);
		arvore.adicionar(7);
		arvore.adicionar(18);
		arvore.adicionar(13);
		arvore.adicionar(20);

//		Em-ordem, Pré-ordem e Pós-ordem

		System.out.println("Em-ordem: ");
		arvore.emOrdem(arvore.getRaiz());
		System.out.print("\n\n");

		arvore.remover(20);

		System.out.println("Em-ordem: ");
		arvore.emOrdem(arvore.getRaiz());
		System.out.print("\n\n");

		arvore.remover(5);

		System.out.println("Em-ordem: ");
		arvore.emOrdem(arvore.getRaiz());
		System.out.print("\n\n");

		arvore.remover(8);

		System.out.println("Em-ordem: ");
		arvore.emOrdem(arvore.getRaiz());
		System.out.print("\n\n");
		
		arvore.remover(9);

		System.out.println("Em-ordem: ");
		arvore.emOrdem(arvore.getRaiz());
		System.out.print("\n\n");
		
		arvore.remover(13);

		System.out.println("Em-ordem: ");
		arvore.emOrdem(arvore.getRaiz());
		System.out.print("\n\n");
		
		arvore.remover(7);
		arvore.remover(18);

		System.out.println("Em-ordem: ");
		arvore.emOrdem(arvore.getRaiz());
		System.out.print("\n\n");
		
		arvore.remover(10);

		System.out.println("Em-ordem: ");
		arvore.emOrdem(arvore.getRaiz());
		System.out.print("\n\n");

//		System.out.println("Pré-ordem: ");
//		arvore.preOrdem(arvore.getRaiz());
//		System.out.print("\n\n");
//		
//		System.out.println("Pós-ordem: ");
//		arvore.posOrdem(arvore.getRaiz());
//		System.out.print("\n\n");
	}

}
