package atv2;

import java.util.Scanner;

public class Exercicio1 {
	
//Faça um programa que receba três inteiros e diga qual deles é o maior.
	
	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		int x, y, z;
		System.out.println("Informe três números inteiros:");
		x = ler.nextInt();
		y = ler.nextInt();
		z = ler.nextInt();
		
		if(x>=y&&x>z||x>y&&x>=z)
		{
			System.out.println("O maior número é "+x+".");
		}
		else if(y>=x&&y>z||y>x&&y>=z)
		{
			System.out.print("O maior número é "+y+".");
		}
		else if(z>=x&&z>y||z>x&&z>=y)
			System.out.print("O maior número é "+z+".");
		else
		{
			System.out.print("Os três números são iguais.");
		}
		ler.close();
	}

}
