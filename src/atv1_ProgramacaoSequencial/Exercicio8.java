package atv1_ProgramacaoSequencial;

import java.util.Scanner;

public class Exercicio8 {

	public static void main(String[] args) {
		float cf, dist, imp, cc;
		Scanner leia= new Scanner (System.in);
		System.out.print("Entre com o valor de Fábrica do veículo: ");
		cf=leia.nextFloat();
		dist=(float) (cf*0.28);
		imp=(float) (cf*0.45);
		cc=cf+dist+imp;
		System.out.print("O valor de venda do veículo é R$: "+ cc);

	}

}
