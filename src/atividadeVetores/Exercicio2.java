package atividadeVetores;

import java.util.Scanner;

/*Um dado � lan�ado 10 vezes e o valor correspondente � anotado. Fa�a um programa
que gere um vetor com os lan�amentos, escreva esse vetor. A seguir determine e
imprima a m�dia aritm�tica dos lan�amentos, contabilize e apresente tamb�m
quantas foram as ocorr�ncias da maior pontua��o.*/
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
		System.out.println("\nA m�dia dos valores lan�ados � :"+media);
		System.out.println("A maior pontua��o ocorreu "+cont+ " vezes");
		
	}

}
