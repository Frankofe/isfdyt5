package isdfd.Poo.Ejercicio2;

	public class CuentaBancaria
	{
	   private double saldo;
	   private Persona titular;
	   
	   public void extraer(double unMonto){
	       saldo-=unMonto;
	   }
	   
	   public void depositar(double unMonto){
	       saldo+=unMonto;
	   }
	   
	   public double getSaldo(){
	       return saldo;
	   }
	   
	   public void setTitular(Persona untitular){
	        titular=untitular;
	    }
	   
	   public Persona getTitular(){
	       return titular;
	   }
	   
	   public void setSaldo(double unSaldo){
	       saldo=unSaldo;
	   }
	   
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}