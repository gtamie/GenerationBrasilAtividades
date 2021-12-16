package atividadeHeranca;

public class Preguica extends Animal{
	//atributo
	private boolean sobeEmArvores;
	
	//método set
	public void setSobeEmArvores(boolean sobeEmArvores) {
		this.sobeEmArvores = sobeEmArvores;
	}

	//método construtor
	public Preguica() {
		sobeEmArvores=true;
	}
	
	//status
	public void statusPreguica(){
		System.out.println("Sobe em árvores: "+this.sobeEmArvores);
	}
	
	//polimorfismo
	@Override
	public void emitirSom() {
		System.out.println("Som: desconhecido");
		
	}

}
