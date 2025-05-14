package ar.edu.unq.po2.tp5;

public abstract class Factura implements Cobrable{
	
	
	@Override
	public void registrarEnCaja(Caja c) {
		// TODO Auto-generated method stub
		c.agregarProducto(this);
	}
	
	
	@Override
	public abstract double calcularMonto();
}
