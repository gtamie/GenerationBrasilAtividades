package atvRepeticao;

import java.util.Scanner;

/*Escrever um programa que receba v�rios n�meros inteiros no teclado. 
 * E no final imprimir a m�dia dos n�meros m�ltiplos de 3. Para sair digitar 0(zero).
 */
public class Exercicio6 {
	
	public static void main(String[] args) {
		float x, contagem=0, soma=0;
		Scanner ler = new Scanner (System.in);
		System.out.println("Informe os valores desejados. Para sair, digite 0(zero).");	
		
		do {
			System.out.print("Digite um n�mero: ");
			x = ler.nextInt();
			if(x%3==0&&x!=0)
			{
				contagem++;
				soma=soma+x;
				
			}
		}while(x!=0);
	System.out.println("A m�dia dos n�meros m�ltiplos de 3 �: "+soma/contagem);
	ler.close();
	}

}
