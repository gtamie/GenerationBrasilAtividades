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
		
		//CRIAR OBJETO AVI�O
		System.out.println("\nAVI�O");
		Aviao av = new Aviao();
		av.setPorte("pequeno");
		av.setCombustivel(50);
		av.setCompanhia("Azul");
		av.setQtdPassageiros(10);
		av.status();
		System.out.println("Assentos livres: "+av.alertarLotacao());
		av.alertarCombustivel();
		
		//CRIAR OBJETO PRODUTO ELETR�NICO
		System.out.println("\nPRODUTO ELETR�NICO");
		ProdutoEletronico pe = new ProdutoEletronico();
		pe.setCategoria("Celular");
		pe.setNumeroSerial(01231234);
		pe.setPreco(1299.99);
		pe.status();
		pe.descontar();
		
		//CRIAR OBJETO FUNCION�RIO
		System.out.println("\nFUNCION�RIO");
		Funcionario f1 = new Funcionario();
		f1.setNome("Lucas Silva");
		f1.setCodigo(45532);
		f1.setCodigoDepartamento((short) 3);
		f1.setQtdFilhosMenor5(1);
		f1.setSalario(3100);
		f1.status();
		f1.liberarCreche();
	}

}
