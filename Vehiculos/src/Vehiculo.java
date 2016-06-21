
public class Vehiculo {
	private String marca = "";
	private String duenio = "";
	private TipoVehiculo tipo;
	private String matricula = "";
	
	Vehiculo(String marca,String duenio,TipoVehiculo tipo ){
	this.setDuenio(duenio);
	this.setMarca(marca);
	this.setTipo(tipo);
	this.setMatricula(matricula);
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getDuenio() {
		return duenio;
	}

	public void setDuenio(String duenio) {
		this.duenio = duenio;
	}

	public TipoVehiculo getTipo() {
		return tipo;
	}

	public void setTipo(TipoVehiculo tipo) {
		this.tipo = tipo;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	@Override
	public String toString() {
		return "\nVehiculo [marca=" + marca + ", duenio=" + duenio + ", tipo="
				+ tipo + ", matricula=" + matricula + "]\n";
	}
		
}
