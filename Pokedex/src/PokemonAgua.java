import java.util.Random;




public class PokemonAgua extends Pokemon {

	public PokemonAgua(String nombre, String tipo, float peso, float altura,
			Integer hp, Integer pc) {
		super(nombre, tipo, peso, altura, hp, pc);
		
	}

	@Override
	public void atacar(Pokemon pkm) {
		
		System.out.println(this.nombre + " a lanzado CHORRO DE AGUA!! ");
		
		Random r = new Random();
		Random r1 = new Random();
		int opDefensa = r.nextInt(2);
		int opAtaque = r1.nextInt(25);
		int ataque = 0;
		 
		switch (opDefensa) {
		case 0:
			pkm.defenderse();
			break;
		case 1:
			if(pkm.getClass()==PokemonFuego.class)
			{
				ataque = opAtaque*2;
				System.out.println(pkm.nombre + " a recibido un ataque critico el HP es: " + ataque);
				pkm.recibirAtaque(ataque);
			}
			else{
			ataque = pkm.hp - opAtaque;
			pkm.hp = ataque;
			}
			
			break;

		/*default:
			System.out.println(this.nombre + " a recibido Golpe critico el HP es: ");
			ataque = this.hp*0;
			break;*/ 
		}
	}
		
	}
		
	
	
