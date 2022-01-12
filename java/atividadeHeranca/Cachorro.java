package atividadeHeranca;

public class Cachorro extends Animal {
	//atributo
	private boolean corre;
	
	//m�todo set e get
	public void setCorre(boolean corre) {
		this.corre = corre;
	}

	
	//m�todo construtor
	public Cachorro() {
		corre = true;
	}
	
	//status
	public void statusCachorro() {
		System.out.println("Corre: "+this.isCorre());
	}
	
	public boolean isCorre() {
		return corre;
	}
	
	@Override
	public void emitirSom() {
		System.out.println("Som: latido");
		
	}
}
