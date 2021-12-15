package atividadeHeranca;
/*1. Crie uma hierarquia de classes, utilize os seus 
 * conhecimentos e distribua as características de forma que tudo 
 * o que for comum a todos os animais fique na classe Animal.
 * 2. Implemente um programa que crie os 3 tipos de animais definidos 
 * no exercício anterior
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
		System.out.println("\nCavalo: ");
		cav.setNome("Apple Jack");
		cav.setIdade(3);
		cav.status();
		cav.statusCachorro();
		System.out.println("\nPreguiça: ");
		bp.setNome("Bicho Preguiça");
		bp.setIdade(1);
		bp.status();
		bp.statusPreguica();
		
		
		

	}

}
