package atv2;
//Faça um programa que entre com três números e coloque em ordem crescente.
import java.util.Scanner;

public class Exercicio2 {
	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		int x, y, z;
		System.out.println("Informe três números inteiros diferentes:");
		x = ler.nextInt();
		y = ler.nextInt();
		z = ler.nextInt();
		
		if(x>y&&x>z&&y>z)
		{
			System.out.println(z+"<"+y+"<"+x);
		}
		else if(x>y&&x>z&&z>y)
		{
			System.out.println(y+"<"+z+"<"+x);
		}
		else if(y>x&&y>z&&x>z)
		{
			System.out.println(z+"<"+x+"<"+y);
		}
		else if(y>x&&y>z&&z>x)
		{
			System.out.println(x+"<"+z+"<"+y);
		}
		else if(z>x&&z>y&&y>x)
		{
			System.out.println(x+"<"+y+"<"+z);
		}
		else if(z>x&&z>y&&y>x)
		{
			System.out.println(y+"<"+x+"<"+z);
		}
		else
		{
			System.out.print("Erro. Digite três números inteiros diferentes.");
		}
	}

}
