package padre;

public class Licencia {
	protected String clase,categoria,fechaEmision,fechaRenovacion;

	public Licencia(String clase, String categoria, String fechaEmision,String fechaRenovacion) {
		this.clase = clase;
		this.categoria = categoria;
		this.fechaEmision = fechaEmision;
		this.fechaRenovacion = fechaRenovacion;
	}
	
	public String datosCompletos() {
		return "Clase : " + clase + "\n" +
	           "Categoria : " + categoria + "\n" +
			   "Fecha de Emision : " + fechaEmision + "\n" +
	           "Fecha de Renovacion : " + fechaRenovacion + "\n" +
			   "Codigo : " + codigo();
	}
	
	public String codigo() {
		return clase + "." + fechaEmision;
	}
}
