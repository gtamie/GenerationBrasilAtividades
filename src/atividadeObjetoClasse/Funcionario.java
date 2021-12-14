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
			System.out.println("Funcion�rio tem direito � creche.");
		}
		
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public void setCodigoDepartamento(short codigoDepartamento) {
		this.codigoDepartamento = codigoDepartamento;
	}
	public void setQtdFilhosMenor5(int qtdFilhosMenor5) {
		this.qtdFilhosMenor5 = qtdFilhosMenor5;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	public void status() {
		System.out.println("Nome: "+this.nome);
		System.out.println("C�digo: "+this.codigo);
		System.out.println("C�digo do departamento: "+this.codigoDepartamento);
		System.out.println("Quantidade de filhos com menos de cinco anos: "+this.qtdFilhosMenor5);
		System.out.println("Sal�rio: R$ "+this.salario);
	

	}
	

}
