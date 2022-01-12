programa
{
	
	funcao inicio()
	{
		inteiro dado[10],x,maior=0,contador=0,soma=0,media
		
		para(x=0;x<10;x++)
		{
			escreva("Digite o valor do dado: ")
			leia(dado[x])
			se(dado[x]>=maior)
			{
				maior=dado[x]
					
			}
			
		}
		
		para(x=0;x<10;x++)
		{
			
			se(dado[x]==maior)
			{
				contador++
			}
			escreva("\nO valor sorteado pelo dado foi: ",(dado[x]))
			
		}
		para(x=0;x<10;x++)
		{
			soma=soma+dado[x]
		}
		media=soma/10
		escreva("\nA média aritmética dos valores é de: ",media)
		escreva("\nO maior valor sorteado foi ",maior,", que apareceu ", contador," vezes.")
		
	}
}


/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 600; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */