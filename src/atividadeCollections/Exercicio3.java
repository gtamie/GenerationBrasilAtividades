package atividadeCollections;

import java.util.*;

/*Crie uma um programa para trabalhar com estoque de uma loja, o programa 
 * deverá trabalhar com Collection do tipo List do Java para manipular os dados
 *  desse estoque, o programa deverá atender as seguintes funcionalidades:
 *Armazenar dados da List 
 *Remover dados da list;
 *Atualizar dados da list.
 *Apresentar todos os dados da list.*/

public class Exercicio3 {

	public static void main(String[] args) {
		
		int opcao, k=-1;
		Scanner ler= new Scanner(System.in);
		ler.useLocale(Locale.US);
		System.out.println("Estoque Papelaria Magenta");
	
	 //criando itens da lista
	 ItensEstoque i1 = new ItensEstoque("Caderno", 14.99, 10);
	 ItensEstoque i2 = new ItensEstoque("Estojo", 20.50, 5);
	 ItensEstoque i3 = new ItensEstoque("Caneta", 4.99, 30);

	 //criando a lista
	 ArrayList<ItensEstoque>estoque=new ArrayList<ItensEstoque>();
	 estoque.add(i1);
	 estoque.add(i2);
	 estoque.add(i3);
	 
	 
	
	do {
		System.out.println("Opções: \n1 - adicionar item \n2 - remover item"
		 		+ "\n3 - atualizar item \n4 - exibir todos os itens \n5 - sair"
		 		+ "\nInforme a opção desejada: ");
		 opcao=ler.nextInt();
		 ler.nextLine();
		 if(opcao==1)
		 {
			 
			 System.out.print("Nome do item:");
			 String x=ler.nextLine();
			 System.out.print("Preço: ");
			 double y= ler.nextDouble();
			 System.out.print("Quantidade: ");
			 int z=ler.nextInt();
			 ler.nextLine();
			 ItensEstoque i4 = new ItensEstoque( x, y, z);
			 estoque.add(i4);
			 
		 }
		 else if(opcao==2)
		 {
			System.out.print("Informe o nome do item que deseja remover: ");
			String itemParaRemover = ler.nextLine();
			int indiceRemover = estoque.indexOf(itemParaRemover);
			estoque.remove(indiceRemover);
		 }
		 else if(opcao==3)//atualizar itens
		 {
			 
			 //exibir todos os itens
			 Iterator itr=estoque.iterator();
			 while(itr.hasNext()) {
				 ItensEstoque ie=(ItensEstoque)itr.next();
				 k+=1;
				 
				System.out.println("Código: "+k+" /Item: "+ie.getNome()+" /Preço: "+ie.getPreço()+"/ Qtd: "+ie.getQuantidade());
				 }
			 
			 System.out.print("Informe o código do item que deseja atualizar: ");
			 int indiceAtualizar = ler.nextInt();
			 ler.nextLine();
			 
			 System.out.print("Digite o nome do item:");
			 String x2=ler.nextLine();
			 System.out.print("Preço: ");
			 double y2= ler.nextDouble();
			 System.out.print("Quantidade: ");
			 int z2=ler.nextInt();
			 ler.nextLine();
			 ItensEstoque i5 = new ItensEstoque( x2, y2, z2);
			 estoque.add(indiceAtualizar, i5);
		 
		 }
		 
		 else if(opcao==4)//apresentar todos os dados da lista
		 {
			 Iterator itr=estoque.iterator();
			 while(itr.hasNext()) {
				 ItensEstoque ie=(ItensEstoque)itr.next();
				 System.out.println("Item: "+ie.getNome()+" /Preço: "+ie.getPreço()+"/ Qtd: "+ie.getQuantidade());
			 }
		 }
		
	}while(opcao!=5);
	 

}
}

