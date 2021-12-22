package atvRepeticao;

import java.util.Scanner;

/*Escrever um programa que receba vários números inteiros no teclado. 
 * E no final imprimir a média dos números múltiplos de 3. Para sair digitar 0(zero).
 */
public class Exercicio6 {
	
	public static void main(String[] args) {
		float x, contagem=0, soma=0;
		Scanner ler = new Scanner (System.in);
		System.out.println("Informe os valores desejados. Para sair, digite 0(zero).");	
		
		do {
			System.out.print("Digite um número: ");
			x = ler.nextInt();
			if(x%3==0&&x!=0)
			{
				contagem++;
				soma=soma+x;
				
			}
		}while(x!=0);
	System.out.println("A média dos números múltiplos de 3 é: "+soma/contagem);
	ler.close();
	}

}
