package isdfd.Poo.Ejercicio3;

public class Cuadrado implements FiguraGeometrica {

	private double lado;	
	
	public double getLado() {
		return lado;
	}

	public void setLado(double lado) {
		this.lado = lado;
	}

	public Cuadrado(double l) {
		lado=l;
	}
	
	public double area() {
		return lado * lado;
	}
	
	public void mover(int unPunto, String unaDireccion) {
		
	}

}
