package atividadeObjetoClasse;

public class ProdutoEletronico {
	
	private String categoria;
	private int numeroSerial;
	private double preco;
	
	
	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}


	public void setNumeroSerial(int numeroSerial) {
		this.numeroSerial = numeroSerial;
	}


	public void setPreco(double preco) {
		this.preco = preco;
	}
	
	public void descontar() {
		if(categoria=="televisão")
		{
			System.out.println("Desconto de 10%.");
		}
	}


	public void status() {
		System.out.println("Categoria: "+this.categoria);
		System.out.println("Numero serial: "+this.numeroSerial);
		System.out.println("Preço: R$"+this.preco);
	}

}
