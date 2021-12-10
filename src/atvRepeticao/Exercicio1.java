package atvRepeticao;
/*Informar todos os números de 1000 a 1999 que quando divididos 
por 11 obtemos resto = 5.*/
public class Exercicio1 {
	
	public static void main(String[] args) {
		short x;
		float resto;
		System.out.println("Os números de 1000 a 1999 que quando divididos por"
				+ " 11 obtemos resto = 5 são: ");
		for(x=1000;x<=1999;x++)
		{
			resto=x%11;
			if(resto==5)
			{
				System.out.println(x);
			}
		}
	}

}
