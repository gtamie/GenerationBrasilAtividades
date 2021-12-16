package atividadeObjetoClasse;
/*Crie uma classe cliente e apresente os atributos e métodos referentes 
 * a esta classe, em seguida crie um objeto cliente, defina as instancias 
 * deste objeto e apresente as informações deste objeto no console.
 */
public class Cliente {

	//atributos
	private String nome;
	private String email;
	private String endereco;
	private String pagamento;
	private long cpf;
	private long celular;
	
	//métodos
	public void descontar() {
		if(pagamento=="boleto")
		{
			System.out.println("Desconto de 5%.");
		}
		
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public String getPagamento() {
		return pagamento;
	}
	public void setPagamento(String pagamento) {
		this.pagamento = pagamento;
	}
	public long getCpf() {
		return cpf;
	}
	public void setCpf(long cpf) {
		this.cpf = cpf;
	}
	public long getCelular() {
		return celular;
	}
	public void setCelular(long celular) {
		this.celular = celular;
	}
	//status
	public void status() {
		System.out.println("Nome:"+getNome());
		System.out.println("CPF: "+getCelular());
		System.out.println("Email: "+getEmail());
		System.out.println("Celular: "+getCelular());
		System.out.println("Endereço: "+getEmail());
		System.out.println("Método de pagamento: "+getPagamento());
	}
	
}
