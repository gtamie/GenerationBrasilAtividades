package atividadeObjetoClasse;

public class Aviao {
	private String porte;
	private double combustivel;
	private String companhia;
	private int qtdPassageiros;
	private int assentosLivres;
	public int alertarLotacao() {
		if(porte=="pequeno"&&qtdPassageiros<20)
		{
			assentosLivres = 20 - this.qtdPassageiros;	
		}
		else if(porte=="médio"&&qtdPassageiros<50)
		{
			assentosLivres = 50 - this.qtdPassageiros;
		}
		else if(porte=="grande"&&qtdPassageiros<100)
		{
			assentosLivres = 100 - this.qtdPassageiros;
		}
		return assentosLivres;
	}
	
	public void alertarCombustivel() {
		if(combustivel<=50)
		{System.out.println("Abasteça o avião.");
	}

}

	public String getPorte() {
		return porte;
	}

	public void setPorte(String porte) {
		this.porte = porte;
	}

	public double getCombustivel() {
		return combustivel;
	}

	public void setCombustivel(double combustivel) {
		this.combustivel = combustivel;
	}

	public String getCompanhia() {
		return companhia;
	}

	public void setCompanhia(String companhia) {
		this.companhia = companhia;
	}

	public int getQtdPassageiros() {
		return qtdPassageiros;
	}

	public void setQtdPassageiros(int qtdPassageiros) {
		this.qtdPassageiros = qtdPassageiros;
	}
	
	public void status() {
		System.out.println("% Combustível: "+this.combustivel);
		System.out.println("Porte: "+this.porte);
		System.out.println("Quantidade de passageiros: "+this.qtdPassageiros);
	}
}
