package atividadeVetores;

import java.util.Scanner;

/*Crie um programa que receba valores do usuário para preencher uma matriz 3X3, e
em seguida, exiba a soma dos valores dela e a soma dos valores da primeira
diagonal, ou seja, diagonal principal.*/
public class Exercicio4 {
	

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		int m[][] = new int[3][3];
		int st=0, sd=0, x, y;
		for(x=0;x<3;x++)
		{
			for(y=0;y<3;y++)
			{
				System.out.print("Digite um valor:" );
				m[x][y] = ler.nextInt();
				st=st+m[x][y];	
			}
		}
		for(x=0;x<3;x++)
		{
			sd=sd+m[x][x];
		}
		System.out.println("A soma de todos os valores da matriz é: "+st);
		System.out.println("A soma dos valores da diagonal principal é: "+sd);
	}
}
