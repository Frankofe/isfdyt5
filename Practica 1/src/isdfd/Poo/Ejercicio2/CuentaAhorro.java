package isdfd.Poo.Ejercicio2;

public class CuentaAhorro extends CuentaBancaria
{
    public void extraer(double unMonto){
       if (getSaldo()-unMonto>=0){
            setSaldo(getSaldo()-unMonto);
        }
   }
   
}