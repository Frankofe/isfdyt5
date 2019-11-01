package Final;

import java.util.ArrayList;
import java.util.List;

public class Compuesto extends Helado {

	private List <Gusto> gustos = new ArrayList<Gusto>();

	public void addGusto(Gusto g) {
		gustos.add(g);
	}
	
	public void removeGusto(Gusto g) {
		gustos.add(g);
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
		if (super.getCliente().isCupon()) {
			total=total*0.90;
		}
		if (super.getCliente().isDelivery()) {
			total=total+50;
		}
		return total;
	}
	
}
