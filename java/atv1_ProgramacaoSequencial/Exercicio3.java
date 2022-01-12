package atv1_ProgramacaoSequencial;
/*Faça um sistema que leia o tempo de duração de um evento em uma fábrica 
 * expressa em segundos e mostre-o expresso em horas, minutos e segundos. 
 */
import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		int evento, h, m, s, r;
		Scanner leia = new Scanner (System.in);
		System.out.print("Digite o tempo de duração em segundos: ");
		evento=leia.nextInt();
		h=evento/3600;
		r=evento%3600;
		m=r/60;
		s=r%60;
		System.out.print("\nO tempo de duração é "+h+" horas "+m+" minutos e "+s+" segundos");
		leia.close();
	}

}
