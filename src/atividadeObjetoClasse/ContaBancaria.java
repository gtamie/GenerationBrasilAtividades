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
		System.out.println("Depósito efetuado. Novo saldo: "+this.saldo);
	}
	
	
	public void setTitular(String titular) {
		this.titular = titular;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}

	public void setSaldo(int saldo) {
		this.saldo = saldo;
	}

	public void status() {
		System.out.println("Titular: "+this.titular);
		System.out.println("Número: "+this.numero);
		System.out.println("Agência: "+this.agencia);
		System.out.println("Saldo: "+this.saldo);
	}

}
