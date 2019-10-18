package isdfd.Poo.Ejercicio3;

public class Main {

	public static void main(String[] args) {
		Editor e1=new Editor();
		Cuadrado cu1=new Cuadrado(10);
		Circulo ci1=new Circulo(70);
		Rectangulo r1=new Rectangulo(20,30);
		Triangulo t1=new Triangulo(15,18);
		e1.addFigura(cu1);
		e1.addFigura(ci1);
		e1.addFigura(r1);
		e1.addFigura(t1);
		
		System.out.println("El area del cuadrado es de: " + cu1.area());
		System.out.println("El area del circulo es de: " + String.format("%.2f",ci1.area()));
		System.out.println("El area del rectangulo es de : " + r1.area());
		System.out.println("El area del Triangulo es de : " + t1.area());
		System.out.println("La suma de todas las areas da un total de: " + String.format("%.2f",e1.totalArea()));
	}
}
