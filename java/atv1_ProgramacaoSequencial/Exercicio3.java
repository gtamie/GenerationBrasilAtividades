package atv1_ProgramacaoSequencial;
/*Fa�a um sistema que leia o tempo de dura��o de um evento em uma f�brica 
 * expressa em segundos e mostre-o expresso em horas, minutos e segundos. 
 */
import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		int evento, h, m, s, r;
		Scanner leia = new Scanner (System.in);
		System.out.print("Digite o tempo de dura��o em segundos: ");
		evento=leia.nextInt();
		h=evento/3600;
		r=evento%3600;
		m=r/60;
		s=r%60;
		System.out.print("\nO tempo de dura��o � "+h+" horas "+m+" minutos e "+s+" segundos");
		leia.close();
	}

}
