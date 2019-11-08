package Final;

public class Persona {

	private String nombre;
	private String domicilio;
	private int dni;
	
	public Persona(String nombre, String domicilio, int dni) {
		super();
		this.nombre = nombre;
		this.domicilio = domicilio;
		this.dni = dni;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDomicilio() {
		return domicilio;
	}

	public void setDomicilio(String domicilio) {
		this.domicilio = domicilio;
	}

	public int getDni() {
		return dni;
	}

	public void setDni(int dni) {
		this.dni = dni;
	}
	
	
	
	
}
