package atvRepeticao;

import java.util.Scanner;

//Ler 10 n�meros e imprimir quantos s�o pares e quantos s�o �mpares.
public class Exercicio2 {

	public static void main(String[] args) {
		int x, numero, contadorPar=0, contadorImpar=0;
		Scanner ler = new Scanner (System.in);
		System.out.println("Informe 10 n�meros inteiros: ");
		for(x=0;x<=9;x++)
		{
		numero=ler.nextInt();
		if(numero%2==0)
		{
			contadorPar++;
		}
		else
		{
			contadorImpar++;
		}
		}
		System.out.println("Quantidade de n�meros �mpares: "+contadorImpar+
				". Quantidade de n�meros pares: "+contadorPar+".");

	}

}
