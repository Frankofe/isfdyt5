package isdfd.Poo.Ejercicio1;

public class Main {

	public static void main(String[] args) {
		Comedor c= new Comedor();
		
		Alumno a= new Alumno();
		
		Plato p= new Plato();
		p.setPrecio(30.00f);
		
		c.agregarReserva(a,p);
		System.out.println(c.totalValor());

	}

}
