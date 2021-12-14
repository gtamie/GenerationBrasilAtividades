package atividadeObjetoClasse;

public class Paciente {
	
	private String nome;
	private int nrProntuario;
	private short idade;
	private String alergia;
	private int ultimaConsulta;
	
	public void telefonar() {
		if(ultimaConsulta>1)
		{
			System.out.println("Telefonar para agendar nova consulta.");
		}
	}
	
		
	public void setNome(String nome) {
		this.nome = nome;
	}


	public void setNrProntuario(int nrProntuario) {
		this.nrProntuario = nrProntuario;
	}


	public void setIdade(short idade) {
		this.idade = idade;
	}


	public void setAlergia(String alergia) {
		this.alergia = alergia;
	}


	public void setUltimaConsulta(int ultimaConsulta) {
		this.ultimaConsulta = ultimaConsulta;
	}


	public void status() {
		System.out.println("Nome: "+this.nome);
		System.out.println("Número do prontuário: "+this.nrProntuario);
		System.out.println("Idade: "+this.idade);
		System.out.println("Alergia: "+this.alergia);
		System.out.println("Última consulta: "+this.ultimaConsulta+" anos atrás");
	}
	

}
