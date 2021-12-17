package atividadeCollections;

import java.util.*;

/*Crie uma um programa para trabalhar com estoque de uma loja, o programa 
 * dever� trabalhar com Collection do tipo List do Java para manipular os dados
 *  desse estoque, o programa dever� atender as seguintes funcionalidades:
 *Armazenar dados da List 
 *Remover dados da list;
 *Atualizar dados da list.
 *Apresentar todos os dados da list.*/

public class Exercicio3 {

	public static void main(String[] args) {
		
		int opcao, k=-1;
		Scanner ler= new Scanner(System.in);
		ler.useLocale(Locale.US); //Para conseguir ler double com ponto(ex.: 20.5)
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
			System.out.println("Op��es: \n1 - adicionar item \n2 - remover item"
		 		+ "\n3 - atualizar item \n4 - exibir todos os itens \n5 - sair"
		 		+ "\nInforme a op��o desejada: ");
			opcao=ler.nextInt();
			ler.nextLine();
			if(opcao==1)
			{
			 
				System.out.print("Nome do item:");
				String x=ler.nextLine();
				System.out.print("Pre�o: ");
				double y= ler.nextDouble();
				System.out.print("Quantidade: ");
				int z=ler.nextInt();
				ler.nextLine();
				ItensEstoque i4 = new ItensEstoque( x, y, z);
				estoque.add(i4);
			 
			}
			else if(opcao==2)
			{
				//mostrar o �ndice de cada item (chamei de c�digo p/ o usuario entender)
				exibir(estoque);
				
				//Pedir o �ndice
				System.out.print("Informe o c�digo do item que deseja remover: ");
				int indiceRemover = ler.nextInt();
				
				//Remover item
				estoque.remove(indiceRemover);
			}
			else if(opcao==3)//atualizar itens
			{
				//mostrar o �ndice de cada item (chamei de c�digo p/ o usuario entender)
				exibir(estoque);
			 
				//Pedir o �ndice
				System.out.print("Informe o c�digo do item que deseja atualizar: ");
				int indiceAtualizar = ler.nextInt();
				ler.nextLine();
			 
				//Pedir para atualizar os dados do item
				System.out.print("Nome do item:");
				String x2=ler.nextLine();
				System.out.print("Pre�o: ");
				double y2= ler.nextDouble();
				System.out.print("Quantidade: ");
				int z2=ler.nextInt();
				ler.nextLine();
				ItensEstoque i5 = new ItensEstoque( x2, y2, z2);
				estoque.set(indiceAtualizar, i5);
		 
			}
		 
			else if(opcao==4)//apresentar todos os dados da lista
			{
				exibir(estoque);
			}
		
		}while(opcao!=5);

	}
	
	public static void exibir (ArrayList lista) {
		
		for (int i = 0; i < lista.size(); i++) {
			System.out.println("C�digo do produto: "+i+
					"/ Nome: "+((ItensEstoque) lista.get(i)).getNome()+
					"/ Pre�o: "+((ItensEstoque) lista.get(i)).getPreco()+
					"/ Quantidade: "+((ItensEstoque) lista.get(i)).getQuantidade());
		}
	}
}

