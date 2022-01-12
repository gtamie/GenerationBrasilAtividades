package atividadeHeranca;

public class Preguica extends Animal{
	//atributo
	private boolean sobeEmArvores;
	
	//m�todo set
	public void setSobeEmArvores(boolean sobeEmArvores) {
		this.sobeEmArvores = sobeEmArvores;
	}

	//m�todo construtor
	public Preguica() {
		sobeEmArvores=true;
	}
	
	//status
	public void statusPreguica(){
		System.out.println("Sobe em �rvores: "+this.sobeEmArvores);
	}
	
	//polimorfismo
	@Override
	public void emitirSom() {
		System.out.println("Som: desconhecido");
		
	}

}
