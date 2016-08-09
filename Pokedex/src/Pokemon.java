
public abstract class Pokemon {
	protected String nombre;
	protected String tipo;
	protected float peso;
	protected float altura;
	protected Integer hp;
	protected Integer pc;
	
	
	
	public Pokemon(String nombre, String tipo, float peso, float altura,
			Integer hp, Integer pc) {
		this.nombre = nombre;
		this.tipo = tipo;
		this.peso = peso;
		this.altura = altura;
		this.hp = hp;
		this.pc = pc;
	}

	public abstract void atacar(Pokemon pkm);
	
	public void defenderse (){
	System.out.println(this.nombre + " a esquivado el ataque.");
	}
	
	
	
	public void evolucionar(String evolucion){
		System.out.println("AHHHHHH! Evolucion!"+ this.nombre+ " a evolucionado a " + evolucion  +" LOADING...");
		this.hp = this.hp + 500;
		this.pc = this.pc + 500;
		this.nombre = evolucion;
		System.out.println("Ahora " +this.nombre + " tiene " + this.hp +"HP y " + this.pc + "PC");
		
	}
	
	public void recibirAtaque(int num){
		this.hp = this.hp - num;
		
		System.out.println(this.nombre +" a recibido el ataque su HP es: " + this.hp);
	}

	
	
}
