package atv1_ProgramacaoSequencial;

import java.util.Scanner;

public class Exercicio7 {

	public static void main(String[] args) {
		float a,b,c,d,e,f,x,y;
		Scanner leia= new Scanner(System.in);
		System.out.print("Entre com os valores de A, B, C, D, E e F: ");
		a=leia.nextFloat();
		b=leia.nextFloat();
		c=leia.nextFloat();
		d=leia.nextFloat();
		e=leia.nextFloat();
		f=leia.nextFloat();
		x=(c*e-b*f)/(a*e-b*d);
		y=(a*f-c*d)/(a*e-b*d);
		System.out.print("Os valores de X e Y são respectivamente: "+x+" e "+y);
		leia.close();
	}

}
