package hijos;

import padre.Licencia;

public class Profesional extends Licencia{
    private String ruc;

	public Profesional(String clase, String categoria, String fechaEmision,String fechaRenovacion, String ruc) {
		super(clase, categoria, fechaEmision, fechaRenovacion);
		this.ruc = ruc;
	}
	
	public String datosCompletos() {
		return super.datosCompletos() + "\n" +
	           "Ruc : " + ruc + "\n" +
			   "Segundo Codigo : " + segundoCodigo();
	}

	private String segundoCodigo() {
		return categoria + "." + ruc;
	}
}
