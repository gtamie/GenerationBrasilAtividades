package atividadeCollections;

public class ItensEstoque {
	
	private String nome;
	private double pre�o;
	private int quantidade;
	
	
	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public double getPre�o() {
		return pre�o;
	}


	public void setPre�o(double pre�o) {
		this.pre�o = pre�o;
	}


	public int getQuantidade() {
		return quantidade;
	}


	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}


	public ItensEstoque(String n, double p, int q) {
		this.setNome(n);
		this.setPre�o(p);
		this.setQuantidade(q);
			
	}
 
}
