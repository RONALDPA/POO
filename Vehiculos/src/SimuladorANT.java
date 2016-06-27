import java.util.ArrayList;


public class SimuladorANT {
	public static void main(String [] args)
	{
	Vehiculo v  = new Vehiculo("ferrari", "Ronald", TipoVehiculo.AUTO);
	Vehiculo v1 = new Vehiculo("Bmw", "Carmen", TipoVehiculo.CAMIONETA);
	Vehiculo v2 = new Vehiculo("HINO", "Cesar", TipoVehiculo.BUS);
	Vehiculo v3 = new Vehiculo("Chevrolet", "Andres", TipoVehiculo.AUTO);
	Vehiculo v4 = new Vehiculo("Chevrolet", "Carlos", TipoVehiculo.FURGONETA);
	Vehiculo v5 = new Vehiculo("Citroen", "Antonio", TipoVehiculo.TRAILER);
	Vehiculo v6 = new Vehiculo("Suzuki", "Byron", TipoVehiculo.MOTO);
	
	
	ANT agenciaSE = new ANT ("Agencia Nacional de Transito - Santa Elena");
	 agenciaSE.matriculaVehiculo(v);
	 agenciaSE.matriculaVehiculo(v1);
	 agenciaSE.matriculaVehiculo(v2);
	 agenciaSE.matriculaVehiculo(v3);
	 agenciaSE.matriculaVehiculo(v4);
	 agenciaSE.matriculaVehiculo(v5);
	 agenciaSE.matriculaVehiculo(v6);
	 
	 TipoVehiculo tipoABuscar = TipoVehiculo.MOTO;
	 
	 ArrayList<Vehiculo> filtrados = agenciaSE.getVehiculosPorTipo(tipoABuscar);
			 if (!filtrados.isEmpty())
			 { System.out.print("\nLos vehiculos de tipo " +  tipoABuscar + " \n Son " + filtrados);}
			 else{System.out.print("No hay vehiculos de tipo" + tipoABuscar); }
	}
}
