package atividadeCollections;

public class ItensEstoque {
	
	private String nome;
	private double preço;
	private int quantidade;
	
	
	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public double getPreço() {
		return preço;
	}


	public void setPreço(double preço) {
		this.preço = preço;
	}


	public int getQuantidade() {
		return quantidade;
	}


	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}


	public ItensEstoque(String n, double p, int q) {
		this.setNome(n);
		this.setPreço(p);
		this.setQuantidade(q);
			
	}
 
}
