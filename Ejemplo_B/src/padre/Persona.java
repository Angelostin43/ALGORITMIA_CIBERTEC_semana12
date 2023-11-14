package padre;

public class Persona {
	
	// Atributos protegidos
	protected String nombre, apellido;
	protected int edad;
	// Constructor
	public Persona(String nombre, String apellido, int edad) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
	}
	// Operaciones públicas
	public String datosCompletos() {
		return "Nombre   :  " + nombre + "\n" +
		       "Apellido :  " + apellido + "\n" +
		       "Edad     :  " + edad + "\n" +
		       "Correo   :  " + generarCorreo();
	}
	// Operaciones privadas	
	private String generarCorreo() {
		return nombre + "." + apellido + "@cibertec.edu.pe";
	}
	
}
