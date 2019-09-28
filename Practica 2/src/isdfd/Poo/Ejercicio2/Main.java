package isdfd.Poo.Ejercicio2;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Mundial m1=new Mundial();
		m1.setNombre("Rusia 2018");
		
		//Partido 1)
		Estadio e1=new Estadio();
		e1.setNombre("Estadio 1");
		e1.setCapacidad(15000);
		Equipo l1=new Equipo();
		l1.setNombre("Argentina");
		Equipo v1=new Equipo();
		v1.setNombre("Uruguay");
		
		//Partido 2)
		Estadio e2=new Estadio();
		e2.setNombre("Estadio 2");
		e2.setCapacidad(20000);
		Equipo l2=new Equipo();
		l2.setNombre("Brazil");
		Equipo v2=new Equipo();
		v2.setNombre("Peru");
		
		//Partido 3)
		Estadio e3=new Estadio();
		e3.setNombre("Estadio 3");
		e3.setCapacidad(30000);
		Equipo l3=new Equipo();
		l3.setNombre("Alemania");
		Equipo v3=new Equipo();
		v3.setNombre("Rusia");
		
		//Partido 4)
		Estadio e4=new Estadio();
		e4.setNombre("Estadio 4");
		e4.setCapacidad(27500);
		Equipo l4=new Equipo();
		l4.setNombre("Japon");
		Equipo v4=new Equipo();
		v4.setNombre("Francia");
		
		m1.agregarPartido(l1, v1, e1, 150);
		m1.agregarPartido(l2, v2, e2, 200);
		m1.agregarPartido(l3, v3, e3, 300);
		m1.agregarPartido(l4, v4, e4, 100);
		
		System.out.println("El mundial "+ m1.getNombre() +" tiene un total de " + m1.totalPartidos() +" partidos.");
		System.out.println("El mundial "+ m1.getNombre() +" tiene un total de " + m1.cantidadTotalEspectadores()+" espectadores.");
		System.out.println("El mundial "+ m1.getNombre() +" recaudo un monto total de $" + m1.montoTotalRecaudado());
		System.out.println("El estadio con mas capacidad es el "+ m1.estadioMasCapacidad().getNombre());
	}
}
