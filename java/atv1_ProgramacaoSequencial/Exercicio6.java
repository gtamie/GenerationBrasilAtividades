package atv1_ProgramacaoSequencial;

import java.util.Scanner;

public class Exercicio6 {

	public static void main(String[] args) {
		double x1, x2, y1, y2, d;
		Scanner leia = new Scanner (System.in);
		System.out.print("Entre com as coordenadas do ponto de partida: ");
		x1=leia.nextFloat();
		y1=leia.nextFloat();
		System.out.print("Entre com as coordenadas do ponto de destino: ");
		x2=leia.nextFloat();
		y2=leia.nextFloat();
		d=Math.sqrt(Math.pow(x2-x1,2)+Math.pow(y2-y1,2));
		System.out.print("A distancie entre os dois pontos é: "+d);
		leia.close();
	}

}
