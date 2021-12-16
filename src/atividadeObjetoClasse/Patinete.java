package atividadeObjetoClasse;

public class Patinete {
	
	private double pesoSuportado;
	private String cor;
	private int rodas;
	private boolean infantil;
	
	public void classificar() {
		if(this.getPesoSuportado()>50)
		{
			infantil=true;
		}
		else
		{
			infantil=false;
		}
	}
	
	
	//setters and getters
	public double getPesoSuportado() {
		return pesoSuportado;
	}


	public void setPesoSuportado(double pesoSuportado) {
		this.pesoSuportado = pesoSuportado;
	}


	public String getCor() {
		return cor;
	}


	public void setCor(String cor) {
		this.cor = cor;
	}


	public int getRodas() {
		return rodas;
	}


	public void setRodas(int rodas) {
		this.rodas = rodas;
	}


	public boolean isInfantil() {
		return infantil;
	}


	public void setInfantil(boolean infantil) {
		this.infantil = infantil;
	}


	public void status() {
		System.out.println("Cor: "+this.cor);
		System.out.println("Quantidade de rodas: "+this.getRodas());
		System.out.println("Peso máximo suportado: "+this.getPesoSuportado());
		System.out.println("Patinete infantil: "+this.isInfantil());
		
		
	}

}
