package atv1_ProgramacaoSequencial;
/*1. Fa�a um sistema que leia a idade de uma pessoa expressa em anos, meses e
dias e mostre-a expressa apenas em dias.*/
import java.util.Scanner;

public class Exercicio1 {
	public static void main(String[] args) {
		int anos, meses, dias, resp;
		Scanner leia = new Scanner (System.in);
		System.out.print("Quantos anos voc� tem?: ");
		anos=leia.nextInt();

		System.out.print("Quantos meses voc� tem?: ");
		meses=leia.nextInt();
		
		System.out.print("Quantos dias voc� tem?: ");
		dias=leia.nextInt();
		
		resp=anos*365+meses*30+dias;
		System.out.println("Sua idade em dias �: "+resp);
	}

}
