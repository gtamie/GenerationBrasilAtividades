package atividadeHeranca;

public class Animal {
	//atributos
	private String nome;
	private int idade;
	private boolean emiteSom;
	//método construtor
	public Animal() {
		emiteSom=true;
	}
	//métodos setters
	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public void setEmiteSom(boolean emiteSom) {
		this.emiteSom = emiteSom;
	}
	//status
	public void status() {
		System.out.println("Nome: "+this.nome);
		System.out.println("Idade: "+this.idade);
		System.out.println("Emite som: "+this.emiteSom);
		
	}

}
