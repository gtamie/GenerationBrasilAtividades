package atvRepeticao;

import java.util.Scanner;

//Ler 10 números e imprimir quantos são pares e quantos são ímpares.
public class Exercicio2 {

	public static void main(String[] args) {
		int x, numero, contadorPar=0, contadorImpar=0;
		Scanner ler = new Scanner (System.in);
		System.out.println("Informe 10 números inteiros: ");
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
		System.out.println("Quantidade de números ímpares: "+contadorImpar+
				". Quantidade de números pares: "+contadorPar+".");

	}

}
