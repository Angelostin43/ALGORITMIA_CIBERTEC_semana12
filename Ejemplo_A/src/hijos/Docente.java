package hijos;

import padre.Persona;

public class Docente extends Persona {
	
	// Atributos privados
	private int horas;
	private double tarifa;
	// Constructor
	public Docente(String nombre, String apellido, int edad,
	               int horas, double tarifa) {
		super(nombre, apellido, edad);
		this.horas = horas;
		this.tarifa = tarifa;
	}
	// Operaciones públicas
	public String datosDelDocente() {
		return datosDeLaPersona() + "\n" +
		       "Horas    :  " + horas + "\n" +
		       "Tarifa   :  S/ " + tarifa + "\n" +
		       "sueldo   :  S/ " + calcularSueldo();
	}
	// Operaciones privadas	
	private double calcularSueldo() {
		return horas * tarifa;
	}
	
}
