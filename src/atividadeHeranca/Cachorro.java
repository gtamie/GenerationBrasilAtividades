package atividadeHeranca;

public class Cachorro extends Animal {
	//atributo
	private boolean corre;
	
	//m�todo set
	public void setCorre(boolean corre) {
		this.corre = corre;
	}
	
	//m�todo construtor
	public Cachorro() {
		corre = true;
	}
	
	//status
	public void statusCachorro() {
		System.out.println("Corre: "+this.corre);
	}

}
