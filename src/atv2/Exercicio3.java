package atv2;

import java.util.Scanner;

public class Exercicio3 {
	/*Fa�a um programa que receba a idade de uma pessoa e mostre na sa�da em 
	 * qual categoria ela se encontra:
	 * 10-14 infantil
	 * 15-17 juvenil
	 * 18-25 adulto */


	public static void main(String[] args) {
		
		Scanner ler = new Scanner (System.in);
		System.out.print("Informe a idade: ");
		int idade= ler.nextInt();
		if(10<=idade&&idade<15)
		{
			System.out.println("A pessoa est� na faixa infantil.");
		}
		else if(15<=idade&&idade<18)
		{
			System.out.println("A pessoa est� na faixa juvenil.");
		}
		else if(18<=idade&&idade<=25)
		{
			System.out.println("A pessoa est� na faixa adulta.");
		}
		else
		{
			System.out.println("Categoria n�o cadastrada.");
		}
		

}
}
