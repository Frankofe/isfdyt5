package Final;

public class Operario extends Empleado {

	public Operario(Persona empleado) {
		super(empleado);
		// TODO Auto-generated constructor stub
	}
	
	public double sueldo() {
		return super.getSueldoBasico();
	}
	
}
