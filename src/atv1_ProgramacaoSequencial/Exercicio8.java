package atv1_ProgramacaoSequencial;
/* O custo ao consumidor de um carro novo � a soma do custo de 
 * f�brica com a percentagem do distribuidor e dos impostos (aplicados 
 * ao custo de f�brica). Supondo que a percentagem do distribuidor seja 
 * de 28% e os impostos de 45%, escrever um sistema que leia o custo de 
 * f�brica de um carro e escreva o custo ao consumidor. 
 */


import java.util.Scanner;

public class Exercicio8 {

	public static void main(String[] args) {
		float cf, dist, imp, cc;
		Scanner leia= new Scanner (System.in);
		System.out.print("Entre com o valor de F�brica do ve�culo: ");
		cf=leia.nextFloat();
		dist=(float) (cf*0.28);
		imp=(float) (cf*0.45);
		cc=cf+dist+imp;
		System.out.print("O valor de venda do ve�culo � R$: "+ cc);

	}

}
