package atvRepeticao;

import java.util.Scanner;

/*Uma empresa desenvolveu uma pesquisa para saber as caracter�sticas psicol�gicas 
 * dos indiv�duos de uma regi�o. Para tanto, a cada uma das pessoas era perguntado: 
 * idade, sexo (1-feminino / 2-masculino / 3-Outros), 
 * e as op��es (1, se a pessoa era calma; 2, se a pessoa era nervosa e 3, se a 
 * pessoa era agressiva). Pede-se para elaborar um sistema que permita ler 
 * os dados de 150 pessoas, calcule e mostre: (WHILE)
 * o n�mero de pessoas calmas;
 * o n�mero de mulheres nervosas; 
 * o n�mero de homens agressivos;
 * o n�mero de outros calmos;
 * o n�mero de pessoas nervosas com mais de 40 anos; 
 * o n�mero de pessoas calmas com menos de 18 anos.
*/
public class Exercicio4 {

	public static void main(String[] args) {
		short idade, x, contPessoasCalmas=0, contMulheresNerv=0, 
				contHomensAgres=0, contOutrosCalmos=0, contPessoasNervMais40=0,
				contPessoasCalmasMenos18=0;
		byte sexo, temperamento;
		Scanner ler = new Scanner (System.in);
		for(x=1;x<=150;x++)
		{
			System.out.printf("Indiv�duo n�%d",x,":");
			System.out.print("\nIdade: ");
			idade=ler.nextShort();
			do {
				System.out.print("Sexo (1-feminino / 2-masculino / 3-Outros): ");
				sexo=ler.nextByte();
			}while(sexo!=1&&sexo!=2&&sexo!=3);
			do {
				System.out.print("Temperamento (1-Pessoa calma / 2-Pessoa nervosa /"
						+ " 3-Pessoa agressiva): ");
				temperamento=ler.nextByte();
			}while(temperamento!=1&&temperamento!=2&&temperamento!=3);
			//Contagem de pessoas calmas:
			if(temperamento==1)
			{
				contPessoasCalmas++;
			}
			//Contagem de mulheres nervosas:
			if(sexo==1&&temperamento==2)
			{
				contMulheresNerv++;
			}
			//Contagem de homens agressivos:
			if(sexo==2&&temperamento==3)
			{
				contHomensAgres++;
			}
			//Contagem de outros calmos:
			if(sexo==3&&temperamento==1)
			{
				contOutrosCalmos++;
			}
			//Contagem de pessoas nervosas com mais de 40 anos
			if(idade>40&&temperamento==2)
			{
				contPessoasNervMais40++;
			}
			//Contagem de pessoas calmas com menos de 18 anos:
			if(idade<18&&temperamento==1)
			{
				contPessoasCalmasMenos18++;
			}
			
		}
		System.out.println("\nTotal de pessoas calmas: "+contPessoasCalmas);
		System.out.println("\nTotal de mulheres nervosas: "+contMulheresNerv);
		System.out.println("\nTotal de homens agressivos: "+contHomensAgres);
		System.out.println("\nTotal de outros calmos: "+contOutrosCalmos);
		System.out.println("\nTotal de pessoas nervosas com mais de 40 anos: "+contPessoasNervMais40);
		System.out.println("\nTotal de pessoas calmas com menos de 18 anos: "+contPessoasCalmasMenos18);
		ler.close();
		
	}

}
