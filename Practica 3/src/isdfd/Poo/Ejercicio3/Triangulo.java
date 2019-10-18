package isdfd.Poo.Ejercicio3;

public class Triangulo implements FiguraGeometrica{

	private double base;
	private double altura;
	
	public Triangulo(double b, double a) {
		base=b;
		altura=a;
	}
	
	public double area() {
		return (base*altura)/2;
	}

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
	
}
