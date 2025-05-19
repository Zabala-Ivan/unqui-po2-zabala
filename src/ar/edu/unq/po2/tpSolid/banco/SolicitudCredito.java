package ar.edu.unq.po2.tpSolid.banco;

public abstract class SolicitudCredito {
	private Cliente cliente;
	private double monto;
	private int plazoEnMeses;
	
    public SolicitudCredito(Cliente cliente, double monto, int plazoEnMeses) {
        this.cliente = cliente;
        this.monto = monto;
        this.plazoEnMeses = plazoEnMeses;
    }
    
    
	public Cliente getCliente() {
		return cliente;
	}
	
    public double getMonto() {
		return monto;
	}

	public int getPlazoEnMeses() {
		return plazoEnMeses;
	}
	
    
    public double getCuotaMensual() {
        return monto / plazoEnMeses;
    }
    
    
	public abstract boolean esAceptable();

}
