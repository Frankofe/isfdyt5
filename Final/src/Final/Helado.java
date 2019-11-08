package Final;

public abstract class Helado {

	private Cliente cliente;
	private Envase envase;
	
	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Envase getEnvase() {
		return envase;
	}

	public void setEnvase(Envase envase) {
		this.envase = envase;
	}

	public double importe() {
		return getCliente().aplicarCargos(envase.getTamaño());
	}
}
