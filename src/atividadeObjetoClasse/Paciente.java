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
	
		
//setters and getters


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public int getNrProntuario() {
		return nrProntuario;
	}


	public void setNrProntuario(int nrProntuario) {
		this.nrProntuario = nrProntuario;
	}



	public short getIdade() {
		return idade;
	}



	public void setIdade(short idade) {
		this.idade = idade;
	}



	public String getAlergia() {
		return alergia;
	}



	public void setAlergia(String alergia) {
		this.alergia = alergia;
	}



	public int getUltimaConsulta() {
		return ultimaConsulta;
	}



	public void setUltimaConsulta(int ultimaConsulta) {
		this.ultimaConsulta = ultimaConsulta;
	}



	public void status() {
		System.out.println("Nome: "+this.getNome());
		System.out.println("Número do prontuário: "+this.getNrProntuario());
		System.out.println("Idade: "+this.getIdade());
		System.out.println("Alergia: "+this.getAlergia());
		System.out.println("Última consulta: "+this.getUltimaConsulta()+" anos atrás");
	}
	

}
