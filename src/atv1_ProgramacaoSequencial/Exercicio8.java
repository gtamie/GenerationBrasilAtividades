package atv1_ProgramacaoSequencial;
/* O custo ao consumidor de um carro novo é a soma do custo de 
 * fábrica com a percentagem do distribuidor e dos impostos (aplicados 
 * ao custo de fábrica). Supondo que a percentagem do distribuidor seja 
 * de 28% e os impostos de 45%, escrever um sistema que leia o custo de 
 * fábrica de um carro e escreva o custo ao consumidor. 
 */


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
