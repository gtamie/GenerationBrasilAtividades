package atividadeHeranca;

public class Cachorro extends Animal {
	//atributo
	private boolean corre;
	
	//método set
	public void setCorre(boolean corre) {
		this.corre = corre;
	}
	
	//método construtor
	public Cachorro() {
		corre = true;
	}
	
	//status
	public void statusCachorro() {
		System.out.println("Corre: "+this.corre);
	}

}
