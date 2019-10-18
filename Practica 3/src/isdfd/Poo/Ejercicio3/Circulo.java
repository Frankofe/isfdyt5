package isdfd.Poo.Ejercicio3;

public class Circulo implements FiguraGeometrica{

	private double radio;
	
	public Circulo(double r) {
		radio=r;
	}
	
	public double getRadio() {
		return radio;
	}

	public void setRadio(double radio) {
		this.radio = radio;
	}

	public double area() {
		return Math.PI*(radio*radio);
	}
}
