package atividadeObjetoClasse;

public class Patinete {
	
	private double pesoSuportado;
	private String cor;
	private int rodas;
	private boolean infantil;
	
	public void classificar() {
		if(this.pesoSuportado>50)
		{
			infantil=true;
		}
		else
		{
			infantil=false;
		}
	}
	
	
	
	public void setPesoSuportado(double pesoSuportado) {
		this.pesoSuportado = pesoSuportado;
	}



	public void setCor(String cor) {
		this.cor = cor;
	}



	public void setRodas(int rodas) {
		this.rodas = rodas;
	}



	public void setInfantil(boolean infantil) {
		this.infantil = infantil;
	}



	public void status() {
		System.out.println("Cor: "+this.cor);
		System.out.println("Quantidade de rodas: "+this.rodas);
		System.out.println("Peso máximo suportado: "+this.pesoSuportado);
		System.out.println("Patinete infantil: "+infantil);
		
		
	}

}
