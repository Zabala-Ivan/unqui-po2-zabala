package ar.edu.unq.po2.tp5;

public class Servicio extends Impuesto{
	
	private int unidadesConsumidas;
	private double costoPorUnidad;
	
	public Servicio(int u, double c) {
		this.unidadesConsumidas =u;
		this.costoPorUnidad=c;
	}
	
	@Override
	public double calcularMonto() {
		// TODO Auto-generated method stub
		return unidadesConsumidas * costoPorUnidad;
	}

	
}
