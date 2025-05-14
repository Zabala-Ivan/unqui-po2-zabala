package ar.edu.unq.po2.tp5;

public class ProductoEmpresa extends Producto{
	public ProductoEmpresa(String n, double p, int s) {
		super(n, p, s);
	}

	@Override
	public double calcularMonto() {
		// TODO Auto-generated method stub
		return precio;
	}

	
}
