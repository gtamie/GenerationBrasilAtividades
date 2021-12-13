package atividadeVetores;

import java.util.Scanner;

/*Um dado é lançado 10 vezes e o valor correspondente é anotado. Faça um programa
que gere um vetor com os lançamentos, escreva esse vetor. A seguir determine e
imprima a média aritmética dos lançamentos, contabilize e apresente também
quantas foram as ocorrências da maior pontuação.*/
public class Exercicio2 {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		int vet[] = new int[10];
		int maior=0,cont=0, x;
		float s=0, media=0;
		for(x=0;x<10;x++)
		{
			System.out.print("Digite um valor: ");
			vet[x] = ler.nextInt();
			if(vet[x]>maior)
			{
				maior=vet[x];
			}
			s=s+vet[x];
		}
		System.out.println("Os valores digitados foram: ");
		for(x=0; x<10;x++)
		{
			if(vet[x]==maior)
			{
				cont++;
			}
		System.out.print(vet[x]+"\t");
		}
		media=s/10;
		System.out.println("\nA média dos valores lançados é :"+media);
		System.out.println("A maior pontuação ocorreu "+cont+ " vezes");
		
	}

}
