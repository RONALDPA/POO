
public class SimuladorPkm {

	public static void main(String[] args) {
		
		Pokemon poliwag = new PokemonAgua("Poliwag", "Agua", 10, 10, 300, 50);
		Pokemon arcanine = new PokemonFuego("Arcanine", "Fuego", 20, 20, 300, 60);
		Pokemon pikachu = new PokemonElectrico("Pikachu", "Electrico", 11, 6, 500, 49);
		
		System.out.println("         *-     ARCANINE VS POLIWAG      -*");
		System.out.println("\n ARCANINE ATACA: ");
		arcanine.atacar(poliwag);
		System.out.println("\n POLIWAG ATACA: ");
		poliwag.atacar(arcanine);
		System.out.println("\n POLIWAG ATACA: ");
		poliwag.atacar(arcanine);
		System.out.println("\n");
		arcanine.evolucionar("ProArcanine");
		
		
		
				
		
		

	}

}
