package atv1_ProgramacaoSequencial;
/*Faça um sistema que leia a idade de uma pessoa expressa em dias e mostre-a
expressa em anos, meses e dias.*/
import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		int anos, meses, dias, resp, sobra;
		Scanner leia = new Scanner (System.in);
		System.out.print("Entre com sua idade em dias: ");
		resp=leia.nextInt();
		anos=resp/365;
		sobra=resp%365;
		meses=sobra/30;
		dias=sobra%30;
		
		System.out.println("Sua idade é: "+anos+" anos, "+meses+" meses e "+dias+" dias");
		leia.close();

	}

}
