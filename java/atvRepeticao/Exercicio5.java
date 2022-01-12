package atvRepeticao;

import java.util.Scanner;

/*Crie um programa que leia um número do teclado até que encontre 
 * um número igual a zero. No final, mostre a soma dos números digitados.
 */
public class Exercicio5 {

	public static void main(String[] args) {
		int x, soma=0;
		Scanner ler = new Scanner (System.in);
		System.out.print("Informe os valores que deseja somar."
				+ "Para encerrar, digite 0.");
		do {
			System.out.println("Digite um número: ");
			x=ler.nextInt();
			soma=soma+x;			
		}while(x!=0);
		System.out.printf("A soma dos números é: %d",soma);
		ler.close();
		
	}

}
