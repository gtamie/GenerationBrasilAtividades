//Faça um programa que crie um vetor por leitura com 5 valores de pontuação de uma atividade e o escreva em seguida. Encontre após a maior pontuação e a apresente. 
programa
{
	funcao inicio()
	{
		inteiro nota[5],n,maior=0
		para(n=0;n<5;n++)
		{
			escreva("Digite a nota da atividade: ")
			leia(nota[n])
			se (nota[n]>maior)
			{
				maior=nota[n]
			}
			
		}
		para(n=0;n<5;n++)
		{
			escreva("\nA nota da atividade é: ",nota[n])
			
		}
		escreva("\nA maior nota é: ",maior)
	}
}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 165; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */