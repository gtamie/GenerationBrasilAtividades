package atividadeHeranca;
/*1. Crie uma hierarquia de classes, utilize os seus 
 * conhecimentos e distribua as caracter?sticas de forma que tudo 
 * o que for comum a todos os animais fique na classe Animal.
 * 2. Implemente um programa que crie os 3 tipos de animais definidos 
 * no exerc?cio anterior e invoque o m?todo que emite o som de cada um 
 * de forma polim?rfica, isto ?, independente do tipo de animal.
 */

public class Exercicio1e2 {

	public static void main(String[] args) {
		
		Cachorro golden = new Cachorro();
		Cavalo cav = new Cavalo();
		Preguica bp = new Preguica();
		System.out.println("Cachorro: ");
		System.out.println();
		golden.setNome("Marley");
		golden.setIdade(2);
		golden.status();
		golden.statusCachorro();
		golden.emitirSom();
		System.out.println("\nCavalo: ");
		cav.setNome("Apple Jack");
		cav.setIdade(3);
		cav.status();
		cav.statusCachorro(); //herdou o mesmo status
		cav.emitirSom();
		System.out.println("\nPregui?a: ");
		bp.setNome("Bicho Pregui?a");
		bp.setIdade(1);
		bp.status();
		bp.statusPreguica();
		bp.emitirSom();
		
		
		

	}

}
