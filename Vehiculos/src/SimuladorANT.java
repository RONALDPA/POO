import java.util.ArrayList;


public class SimuladorANT {
	public static void main(String [] args)
	{
	Vehiculo v  = new Vehiculo("Fiat", "Blas", TipoVehiculo.CAMIONETA);
	Vehiculo v1 = new Vehiculo("Toyota", "Wilso", TipoVehiculo.BUS);
	Vehiculo v2 = new Vehiculo("HINO", "Alberto", TipoVehiculo.BUS);
	Vehiculo v3 = new Vehiculo("Chevy", "Luis", TipoVehiculo.AUTO);
	
	
	ANT agenciaSE = new ANT ("Agencia Nacional de Transito");
	 agenciaSE.matriculaVehiculo(v);
	 agenciaSE.matriculaVehiculo(v1);
	 agenciaSE.matriculaVehiculo(v2);
	 agenciaSE.matriculaVehiculo(v3);
	
	 TipoVehiculo tipoABuscar = TipoVehiculo.BUS;
	 ArrayList<Vehiculo> filtrados = agenciaSE.getVehiculosPorTipo(tipoABuscar);
			 if (!filtrados.isEmpty())
			 { System.out.print("Los vehiculos de tipo " +  tipoABuscar );}
			 else{System.out.print("No hay vehiculos de tipo" + tipoABuscar); }
	}
}
