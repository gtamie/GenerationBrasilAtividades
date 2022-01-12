package atividadeObjetoClasse;

public class Aviao {
	//ATRIBUTOS
	private String porte;
	private double combustivel;
	private String companhia;
	private int qtdPassageiros;
	private int assentosLivres;
	private boolean permissaoDecolar;
	
	//MÉTODOS
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
		{
			System.out.println("Abasteça o avião.");
		}

	}

	
	public boolean decolar() {
		if(combustivel<=50)
		{
			permissaoDecolar=false;
		}
		else
		{
			permissaoDecolar=true;
		}
		return permissaoDecolar;
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
		System.out.println("% Combustível: "+getCombustivel());
		System.out.println("Porte: "+getPorte());
		System.out.println("Quantidade de passageiros: "+getQtdPassageiros());
		System.out.println("Companhia: "+getCompanhia());
	}
}
