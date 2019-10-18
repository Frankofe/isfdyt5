package isdfd.Poo.Ejercicio3;

public class Rectangulo implements FiguraGeometrica{
	
	public double getBase() {
		return base;
	}

	public void setBase(double base) {
		this.base = base;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	private double base;
	private double altura;
	
	public Rectangulo(double b, double a) {
		base=b;
		altura=a;
	}
	
	public double area() {
		return base * altura;
	}
}
