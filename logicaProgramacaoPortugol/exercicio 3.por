programa
{
	
	funcao inicio()
	{
		inteiro n1[4][6],n2[4][6],m1[4][6],m2[4][6],linha,coluna
		escreva("Preenchendo a matriz n1\n")
		para(linha=0;linha<4;linha++)
		{
			para(coluna=0;coluna<6;coluna++)
			{
			escreva("Digite um número: ")
			leia(n1[linha][coluna])	
			}
		}
		escreva("\nPreenchendo a matriz n2\n")
		para(linha=0;linha<4;linha++)
		{
			para(coluna=0;coluna<6;coluna++)
			{
			escreva("Digite um número: ")
			leia(n2[linha][coluna])	
			}	
		
		}
		escreva("\nCriando a matriz m1\n")
		para(linha=0;linha<4;linha++)
		{
			para(coluna=0;coluna<6;coluna++)
			{
			m1[linha][coluna]=n1[linha][coluna]+n2[linha][coluna]
			}	
		
		}
		para(linha=0;linha<4;linha++)
		{
			para(coluna=0;coluna<6;coluna++)
			{
			escreva(m1[linha][coluna],"\t")
			}	
		escreva("\n")
		}
		escreva("\nCriando a matriz m2\n")
		para(linha=0;linha<4;linha++)
		{
			para(coluna=0;coluna<6;coluna++)
			{
			m2[linha][coluna]=n1[linha][coluna]-n2[linha][coluna]
			}	
		
		}
		para(linha=0;linha<4;linha++)
		{
			para(coluna=0;coluna<6;coluna++)
			{
			escreva(m2[linha][coluna],"\t")
			}	
		escreva("\n")
		}
	}
}





/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 1121; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */