package atividadeObjetoClasse;

public class Aplicacao {

	public static void main(String[] args) {
		
		//CRIAR OBJETO CLIENTE
		System.out.println("CLIENTE");
		Cliente cl = new Cliente();
		cl.setNome("Percy Jackson");
		cl.setCpf(11111111111l);
		cl.setCelular(99999999999l);
		cl.setEmail("pjackson@riordan.com");
		cl.setEndereco("Acampamento Meio-Sangue, SN");
		cl.setPagamento("boleto");
		cl.status();
		cl.descontar();
		
		//CRIAR OBJETO AVIÃO
		System.out.println("\nAVIÃO");
		Aviao av = new Aviao();
		av.setPorte("pequeno");
		av.setCombustivel(50);
		av.setCompanhia("Azul");
		av.setQtdPassageiros(10);
		av.status();
		System.out.println("Assentos livres: "+av.alertarLotacao());
		av.alertarCombustivel();
		
		//CRIAR OBJETO PRODUTO ELETRÔNICO
		System.out.println("\nPRODUTO ELETRÔNICO");
		ProdutoEletronico pe = new ProdutoEletronico();
		pe.setCategoria("Celular");
		pe.setNumeroSerial(01231234);
		pe.setPreco(1299.99);
		pe.status();
		pe.descontar();
		
		//CRIAR OBJETO FUNCIONÁRIO
		System.out.println("\nFUNCIONÁRIO");
		Funcionario f1 = new Funcionario();
		f1.setNome("Lucas Silva");
		f1.setCodigo(45532);
		f1.setCodigoDepartamento((short) 3);
		f1.setQtdFilhosMenor5(1);
		f1.setSalario(3100);
		f1.status();
		f1.liberarCreche();
		
		//CRIAR OBJETO PATINETE
		System.out.println("\nPATINETE");
		Patinete p1 = new Patinete();
		p1.setCor("Vermelho");
		p1.setPesoSuportado(60);
		p1.setRodas(2);
		p1.status();
		
		//CRIAR OBJETO CONTA BANCÁRIA
		System.out.println("\nCONTA BANCÁRIA");
		ContaBancaria cb = new ContaBancaria();
		cb.setTitular("Edgar Alan Poe");
		cb.setAgencia(000);
		cb.setNumero(0000000);
		cb.setSaldo(1000);
		cb.sacar(500);
		cb.depositar(900);
		cb.status();
		
		//CRIAR OBJETO PACIENTE
		System.out.println("\nPACIENTE");
		Paciente p11 = new Paciente();
		p11.setNome("Maria Aparecida");
		p11.setNrProntuario(123);
		p11.setIdade((short) 45);
		p11.setAlergia("Iodo");
		p11.setUltimaConsulta(2);
		p11.status();
	}

}
