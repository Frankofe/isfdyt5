package Final;

public abstract class Compra {

	private Proveedor se�or;
	
	public Proveedor getProveedor() {
		return se�or;
	}

	public void setProveedor(Proveedor p) {
		this.se�or=p;;
	}
	
	public abstract double valor();
}




