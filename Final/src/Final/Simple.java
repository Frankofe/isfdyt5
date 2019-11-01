package Final;

public class Simple extends Helado {

	private Gusto gusto;
	

	public Gusto getGusto() {
		return gusto;
	}

	public void setGusto(Gusto gusto) {
		this.gusto = gusto;
	}

	public double importe() {
		double total = 0;
		switch (super.getEnvase()) {
		case 1:
			total = 100;
			break;
		case 2:
			total = 200;
			break;
		case 3:
			total = 400;
			break;
		}
		if (super.getCliente().isDelivery()) {
			total=total+50;
		}
		return total;
	}
	
}
