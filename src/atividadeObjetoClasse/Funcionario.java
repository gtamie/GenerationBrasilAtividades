package atividadeObjetoClasse;

public class Funcionario {
	
	private String nome;
	private int codigo;
	private short codigoDepartamento;
	private int qtdFilhosMenor5;
	private double salario;
	
	public void liberarCreche() {
		if(this.qtdFilhosMenor5>0)
		{
			System.out.println("Funcionário tem direito à creche.");
		}
		
	}

	//getters and setters
	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public int getCodigo() {
		return codigo;
	}


	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}


	public short getCodigoDepartamento() {
		return codigoDepartamento;
	}


	public void setCodigoDepartamento(short codigoDepartamento) {
		this.codigoDepartamento = codigoDepartamento;
	}


	public int getQtdFilhosMenor5() {
		return qtdFilhosMenor5;
	}


	public void setQtdFilhosMenor5(int qtdFilhosMenor5) {
		this.qtdFilhosMenor5 = qtdFilhosMenor5;
	}


	public double getSalario() {
		return salario;
	}


	public void setSalario(double salario) {
		this.salario = salario;
	}

	//status
	public void status() {
		System.out.println("Nome: "+this.getNome());
		System.out.println("Código: "+this.getCodigo());
		System.out.println("Código do departamento: "+this.getCodigoDepartamento());
		System.out.println("Quantidade de filhos com menos de cinco anos: "+this.getQtdFilhosMenor5());
		System.out.println("Salário: R$ "+this.getSalario());
	

	}
	

}
