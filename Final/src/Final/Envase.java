package Final;

public enum Envase {
	
	CHICO(100), MEDIO(200), GRANDE(400);

	private int tama�o;

	private Envase(int tama�o) {
		this.tama�o = tama�o;
	}

	public int getTama�o() {
		return tama�o;
	}

	
}

