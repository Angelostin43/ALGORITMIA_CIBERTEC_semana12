package hijos;

import padre.Licencia;

public class Particular extends Licencia{
	
	private int Dni;

	public Particular(String clase, String categoria, String fechaEmision,String fechaRenovacion,int Dni) {
		super(clase, categoria, fechaEmision, fechaRenovacion);
		this.Dni = Dni;
	}
	
	public String datosCompletos() {
		return super.datosCompletos() + "\n" +
	           "Dni : " + Dni + "\n" +
			   "Segundo Codigo : " + segundoCodigo();
	}

	private String segundoCodigo() {
		return categoria + "." + Dni;
	}
}
