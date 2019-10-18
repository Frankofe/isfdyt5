package isdfd.Poo.Ejercicio2;

public class Dividir {

	public int dividir(int a, int b) {
		return a/b;
	}
	
	public static void main (String[] args) {
		Dividir d=new Dividir();
		System.out.println(d.dividir(9,3));
		System.out.println(d.dividir(9,0));
	}
}
