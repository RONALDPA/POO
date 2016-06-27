import java.util.ArrayList;


public class ANT {
	private ArrayList<Vehiculo> vehiculosRegistrados = new ArrayList <Vehiculo>();
		private static int ultimaMatricula;
		private String nombreAgencia ="";
		
		ANT(String nombreAgencia){
			this.nombreAgencia = nombreAgencia;
		}
		
		public ArrayList<Vehiculo> getVehiculosPorTipo(TipoVehiculo tipoFiltro){
			ArrayList<Vehiculo> vehiculosFiltrados = new ArrayList<Vehiculo>();
				for(Vehiculo v:vehiculosRegistrados){
					if(v.getTipo()==tipoFiltro){
						vehiculosFiltrados.add(v);
					}
				}
			return vehiculosFiltrados;
		}
		public void matriculaVehiculo(Vehiculo v){
			v.setMatricula("YAA" + ultimaMatricula);
			ultimaMatricula++;
			vehiculosRegistrados.add(v);
		}
}
