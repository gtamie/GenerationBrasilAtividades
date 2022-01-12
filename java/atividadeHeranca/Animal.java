package atividadeHeranca;

public abstract class Animal {
	//atributos
	private String nome;
	private int idade;
	
	
	//Polimorfismo
	
	public abstract void emitirSom();
	
	
	//métodos setters e getters
	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public int getIdade() {
		return idade;
	}


	public void setIdade(int idade) {
		this.idade = idade;
	}

	
	//status
	public void status() {
		System.out.println("Nome: "+this.getNome());
		System.out.println("Idade: "+this.getIdade());
		
		
	}


	
}
