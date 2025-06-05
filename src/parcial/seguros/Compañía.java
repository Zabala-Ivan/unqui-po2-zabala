package parcial.seguros;

import java.util.ArrayList;
import java.util.List;

public class Compañía {
	private List<Poliza> polizas;
	
	public Compañía() {
		this.polizas = new ArrayList<>();
	}
	
    public void registrarPoliza(Poliza poliza) {
        polizas.add(poliza);
    }
}
