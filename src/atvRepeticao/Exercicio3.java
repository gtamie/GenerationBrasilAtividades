package atvRepeticao;

import java.util.Scanner;

/*Solicitar a idade de várias pessoas e imprimir: Total de pessoas com menos 
 * de 21 anos. Total de pessoas com mais de 50 anos. O programa termina quando 
 * idade for =-99. (WHILE)
 */
public class Exercicio3 {
	
	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		short idade=0, contagemMenos21=0, contagemMais50=0;
		
		System.out.println("Para informar a idade de uma pessoa, digite o valor"
				+ " e pressione enter. \nPara continuar informando a idade de "
				+ "outras pessoas, basta informar o valor da nova idade e"
				+ "pressionar enter. \nPara encerrar o programa, digite -99"
				+ " e pressione enter. \nInforme a idade: ");
		while(idade!=-99)
		{
		idade=ler.nextShort();
		if(idade<21&&idade!=-99)
		{
			contagemMenos21++;
		}
		else if(idade>50)
		{
			contagemMais50++;
		}
		
		}
		System.out.println("Total de pessoas com menos de 21 anos: "+
				contagemMenos21+"\nTotal de pessoas com mais de 50 anos: "+contagemMais50);
	}

}
