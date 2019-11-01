package Final;

public abstract class Helado {

	private Cliente cliente;
	private int envase;
	
	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public int getEnvase() {
		return envase;
	}

	public void setEnvase(int envase) {
		this.envase = envase;
	}

	public abstract double importe();
	
}
