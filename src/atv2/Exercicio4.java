package atv2;

import java.util.Scanner;

/*Fa�a um programa em que permita a entrada de um n�mero qualquer e exiba se este 
 * n�mero � par ou �mpar. Se for par exiba tamb�m a raiz quadrada do mesmo; 
 * se for �mpar exiba o n�mero elevado ao quadrado.
 */

public class Exercicio4 {
	public static void main(String[] args) {
		int n, potencia;
		double raiz;
		Scanner ler = new Scanner (System.in);
		System.out.print("Informe um n�mero: ");
		n = ler.nextInt();
		if(n%2==0)
		{
		raiz = Math.sqrt(n);
		System.out.println(n+" � par. A raiz quadrada de "+n+" � "+raiz);
		}
		else
		{
		potencia = n*n;
		System.out.println(n+" � �mpar. "+n+"�="+potencia);
			
		}
	}

}
