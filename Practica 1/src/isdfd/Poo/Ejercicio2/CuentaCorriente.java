package isdfd.Poo.Ejercicio2;

public class CuentaCorriente extends CuentaBancaria
{
    private int limite;
    
    public void setLimite(int unlimite){
       limite=unlimite;
   }
    
    public void extraer(double unMonto){
       if (limite>0){
            setSaldo(getSaldo()-unMonto);
            limite--;
        }
   }
}

