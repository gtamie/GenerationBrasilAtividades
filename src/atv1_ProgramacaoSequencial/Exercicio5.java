package atv1_ProgramacaoSequencial;
/*Fa�a um sistema que leia as 3 notas de um aluno e calcule a m�dia final 
 * deste aluno. Considerar que a m�dia � ponderada e que o peso das notas �:
 * 2,3 e 5, respectivamente. 
 */

import java.util.Scanner;

public class Exercicio5 {
	public static void main(String[] args) {
		float n1, n2, n3, m;
		Scanner leia = new Scanner (System.in);
		System.out.print("Entre com as m�dias: ");
		n1=leia.nextInt();
		n2=leia.nextInt();
		n3=leia.nextInt();
		n1=n1*2;	
		n2=n2*3;
		n3=n3*5;
		m=(n1+n2+n3)/10;
		System.out.print("A m�dia ponderada �: "+m);
	}

}
