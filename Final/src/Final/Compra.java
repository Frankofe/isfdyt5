package Final;

public abstract class Compra {

	private Proveedor señor;
	
	public Proveedor getProveedor() {
		return señor;
	}

	public void setProveedor(Proveedor p) {
		this.señor=p;;
	}
	
	public abstract double valor();
}




