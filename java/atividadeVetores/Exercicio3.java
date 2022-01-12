package atividadeVetores;

import java.util.Scanner;

public class Exercicio3 {
/*Escreva um programa que lê duas matrizes N1 (4,6) e N2(4,6) e cria:
a) Uma matriz M1 cujos elementos serão as somas dos elementos de mesma posição
das matrizes N1 e N2;
b) Uma matriz M2 cujos elementos serão as diferenças dos elementos de mesma
posição das matrizes N1 e N2.*/
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
				System.out.print("Digite um número: ");
				n1[l][c] =ler.nextInt();	
			}
		}
		System.out.println("Preenchendo a matriz n2");
		for(l=0;l<4;l++)
		{
			for(c=0;c<6;c++)
			{
				System.out.print("Digite um número: ");
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
