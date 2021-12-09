package atv2;

import java.util.Scanner;

/*Faça um programa em que permita a entrada de um número qualquer e exiba se este 
 * número é par ou ímpar. Se for par exiba também a raiz quadrada do mesmo; 
 * se for ímpar exiba o número elevado ao quadrado.
 */

public class Exercicio4 {
	public static void main(String[] args) {
		int n, potencia;
		double raiz;
		Scanner ler = new Scanner (System.in);
		System.out.print("Informe um número: ");
		n = ler.nextInt();
		if(n%2==0)
		{
		raiz = Math.sqrt(n);
		System.out.println(n+" é par. A raiz quadrada de "+n+" é "+raiz);
		}
		else
		{
		potencia = n*n;
		System.out.println(n+" é ímpar. "+n+"²="+potencia);
			
		}
	}

}
