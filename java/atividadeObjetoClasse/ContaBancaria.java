package atividadeObjetoClasse;

public class ContaBancaria {
	
	private String titular;
	private int numero;
	private int agencia;
	private int saldo;
	
	public void sacar(int saque) {
		if(saldo<saque)
		{
			System.out.println("Saldo insuficiente.");
		}
		else
		{
			this.saldo=this.saldo-saque;
			System.out.println("Saque efetuado. Novo saldo: "+saldo);
		}
		
	}
	
	public void depositar(int deposito) {
		this.saldo=this.saldo+deposito;
		System.out.println("Dep�sito efetuado. Novo saldo: "+this.saldo);
	}
	
	
	//m�todos getters and setters

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public int getAgencia() {
		return agencia;
	}

	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}

	public int getSaldo() {
		return saldo;
	}

	public void setSaldo(int saldo) {
		this.saldo = saldo;
	}

	public void status() {
		System.out.println("Titular: "+this.getTitular());
		System.out.println("N�mero: "+this.getNumero());
		System.out.println("Ag�ncia: "+this.getAgencia());
		System.out.println("Saldo: "+this.getSaldo());
	}

}
