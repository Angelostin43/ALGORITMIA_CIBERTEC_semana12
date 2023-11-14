package hijos;

import padre.Vehiculo;

public class Camioneta extends Vehiculo{
	private double precio;
	
	
	public Camioneta(String marca, String modelo, String placa, double precio) {
		super(marca, modelo, placa);
		this.precio = precio;
	}

	public String datosCompletos() {
		return super.datosCompletos() + "\n" +
			  "Importe a pagar : " + aPagar();
	}
	
	public double aPagar() {
		return precio * 0.20;
	}
}
