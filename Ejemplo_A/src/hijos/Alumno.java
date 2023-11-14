package hijos;

import padre.Persona;

public class Alumno extends Persona {
	
	// Atributos privados
	private int nota1, nota2, nota3;
	// Constructor
	public Alumno(String nombre, String apellido, int edad,
	              int nota1, int nota2, int nota3) {
		super(nombre, apellido, edad);
		this.nota1 = nota1;
		this.nota2 = nota2;
		this.nota3 = nota3;	
	}
	// Operaciones públicas
	public String datosDelAlumno() {
		return datosDeLaPersona() + "\n" +
		       "Nota1    :  " + nota1 + "\n" +
		       "Nota2    :  " + nota2 + "\n" +
		       "Nota3    :  " + nota3 + "\n" +
		       "Promedio :  " + calcularPromedio();
	}
	// Operaciones privadas
	private double calcularPromedio() {
		return (nota1 + nota2 + nota3) / 3.0;
	}
	
}
