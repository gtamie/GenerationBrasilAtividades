package atv2;

import java.util.Scanner;

public class Exercicio1 {
	
//Fa�a um programa que receba tr�s inteiros e diga qual deles � o maior.
	
	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		int x, y, z;
		System.out.println("Informe tr�s n�meros inteiros:");
		x = ler.nextInt();
		y = ler.nextInt();
		z = ler.nextInt();
		
		if(x>=y&&x>z||x>y&&x>=z)
		{
			System.out.println("O maior n�mero � "+x+".");
		}
		else if(y>=x&&y>z||y>x&&y>=z)
		{
			System.out.print("O maior n�mero � "+y+".");
		}
		else if(z>=x&&z>y||z>x&&z>=y)
			System.out.print("O maior n�mero � "+z+".");
		else
		{
			System.out.print("Os tr�s n�meros s�o iguais.");
		}
		ler.close();
	}

}
