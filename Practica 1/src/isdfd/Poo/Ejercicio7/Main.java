package isdfd.Poo.Ejercicio7;

public class Main {
	 public static void main(String[] args) {
		 Internacional i = new Internacional();
		 i.setMonto(23);
		 i.setMoneda(Moneda.EURO);
		 
		 System.out.println(i.conversionAPesos());
	}
}
