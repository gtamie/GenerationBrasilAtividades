package atividadeVetores;

import java.util.Scanner;

public class Exercicio3 {
/*Escreva um programa que l� duas matrizes N1 (4,6) e N2(4,6) e cria:
a) Uma matriz M1 cujos elementos ser�o as somas dos elementos de mesma posi��o
das matrizes N1 e N2;
b) Uma matriz M2 cujos elementos ser�o as diferen�as dos elementos de mesma
posi��o das matrizes N1 e N2.*/
	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		int n1[][] = new int[4][6];
		int n2[][] = new int[4][6];
		int m1[][] = new int [4][6];
		int m2[][] = new int [4][6];
		int l, c;
		System.out.println("Preenchendo a matriz n1");
		for(l=0;l<4;l++)
		{
			for(c=0;c<6;c++)
			{
				System.out.print("Digite um n�mero: ");
				n1[l][c] =ler.nextInt();	
			}
		}
		System.out.println("Preenchendo a matriz n2");
		for(l=0;l<4;l++)
		{
			for(c=0;c<6;c++)
			{
				System.out.print("Digite um n�mero: ");
				n2[l][c] = ler.nextInt();
			}	
		
		}
		System.out.println("Criando a matriz m1");
		for(l=0;l<4;l++)
		{
			for(c=0;c<6;c++)
			{
			m1[l][c]=n1[l][c]+n2[l][c];
			}	
		
		}
		for(l=0;l<4;l++)
		{
			for(c=0;c<6;c++)
			{
				System.out.print(m1[l][c]+"\t");
			}	
		System.out.println("\n");
		}
		System.out.println("\nCriando a matriz m2\n");
		for(l=0;l<4;l++)
		{
			for(c=0;c<6;c++)
			{
			m2[l][c]=n1[l][c]-n2[l][c];
			}	
		
		}
		for(l=0;l<4;l++)
		{
			for(c=0;c<6;c++)
			{
				System.out.print(m2[l][c]+"\t");
			}	
			System.out.println("\n");
		}
		ler.close();

	}

}
