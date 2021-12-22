package atv1_ProgramacaoSequencial;

import java.util.Scanner;
import java.lang.Math;

public class Exercicio4 {

	public static void main(String[] args) {
		double a, b, c, r, s, d;
		Scanner leia = new Scanner (System.in);
		System.out.print("Digite o valor de A: ");
		a=leia.nextInt();
		
		System.out.print("Digite o valor de B: ");
		b=leia.nextInt();
		
		System.out.print("Digite o valor de C: ");
		c=leia.nextInt();
		
		r= Math.pow(a+b,2.0);	
		s= Math.pow(b+c,2.0);
		d= (r+s)/2;
		System.out.print("O resultado é: "+d);
		leia.close();

	}

}
