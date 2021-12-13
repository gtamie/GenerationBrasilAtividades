package atividadeVetores;
/*Faça um programa que crie um vetor por leitura com 5 valores de pontuação de 
 * uma atividade e o escreva em seguida. Encontre após a maior pontuação e a apresente.
 */

import java.util.Scanner;

public class Exercicio1 {
	
	public static void main(String[] args) {
		
		Scanner ler = new Scanner (System.in);
		int vet[] = new int[5]; 
		int maior=0, x;
		for (x=0;x<5;x++)
		{
			System.out.print("Digite um valor: ");
			vet[x] = ler.nextInt();
			if(vet[x]>maior)
			{
				maior = vet[x];
			}
		}
		System.out.println("Os valores digitados foram: ");
		for (x=0;x<5;x++)
		{
			System.out.print(vet[x]+"\t");
		}
		System.out.println("\n O maior valor digitado foi: "+ maior);
		

	}
	

}
