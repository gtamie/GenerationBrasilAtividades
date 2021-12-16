package atividadeObjetoClasse;

public class ProdutoEletronico {
	
	private String categoria;
	private int numeroSerial;
	private double preco;
	
	//setters and getters	
	public String getCategoria() {
		return categoria;
	}


	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}


	public int getNumeroSerial() {
		return numeroSerial;
	}


	public void setNumeroSerial(int numeroSerial) {
		this.numeroSerial = numeroSerial;
	}


	public double getPreco() {
		return preco;
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

	//status
	public void status() {
		System.out.println("Categoria: "+this.getCategoria());
		System.out.println("Numero serial: "+this.getNumeroSerial());
		System.out.println("Preço: R$"+this.getPreco());
	}

}
