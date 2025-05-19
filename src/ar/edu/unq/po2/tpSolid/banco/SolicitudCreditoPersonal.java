package ar.edu.unq.po2.tpSolid.banco;

public class SolicitudCreditoPersonal extends SolicitudCredito{
	
    public SolicitudCreditoPersonal(Cliente cliente, double monto, int plazoEnMeses) {
        super(cliente, monto, plazoEnMeses);
    }
    
    @Override
    public boolean esAceptable() {
        Cliente c = getCliente();
        return c.getSueldoAnual() >= 15000 &&
               getCuotaMensual() <= c.getSueldoMensual() * 0.70;
    }
    
}
