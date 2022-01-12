package atividadeCollections;

public class ItensEstoque {
	
	private String nome;
	private double preco;
	private int quantidade;
	
	
	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public double getPreco() {
		return preco;
	}


	public void setPreco(double preco) {
		this.preco = preco;
	}


	public int getQuantidade() {
		return quantidade;
	}


	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}


	public ItensEstoque(String n, double p, int q) {
		this.setNome(n);
		this.setPreco(p);
		this.setQuantidade(q);
			
	}
 
}
