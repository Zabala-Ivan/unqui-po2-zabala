package ar.edu.unq.po2.tp5;

import java.util.ArrayList;
import java.util.List;

public class Caja {
	private Agencia agencia;
	
	private List<Cobrable> productos = new ArrayList<>();
	
	public void agregarProducto(Cobrable p) {
		productos.add(p);
	}
	
	public double calcularTotal() {
		double total = 0;
		for (Cobrable i : productos) {
			total += i.calcularMonto();		
		}
		return total;
	}
	
	
	//Desde la caja va a registrar Pago de cada cobrable que este en su lista//
	public void registrarTotal() {
		for (Cobrable i : productos) {
			 i.registrarPago(agencia);		
		}
	}
}
