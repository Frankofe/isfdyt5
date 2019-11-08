package Final;

public enum Envase {
	
	CHICO(100), MEDIO(200), GRANDE(400);

	private int tamaño;

	private Envase(int tamaño) {
		this.tamaño = tamaño;
	}

	public int getTamaño() {
		return tamaño;
	}

	
}

