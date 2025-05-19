package ar.edu.unq.po2.tpSolid.banco;

public class SolicitudCreditoHipotecario extends SolicitudCredito{
    private Propiedad garantia;

    public SolicitudCreditoHipotecario(Cliente cliente, double monto, int plazoEnMeses, Propiedad garantia) {
        super(cliente, monto, plazoEnMeses);
        this.garantia = garantia;
    }

    @Override
    public boolean esAceptable() {
        Cliente c = getCliente();
        double edadFinal = c.getEdad() + (getPlazoEnMeses() / 12.0);
        return getCuotaMensual() <= c.getSueldoMensual() * 0.50 &&
               getMonto() <= garantia.getValorFiscal() * 0.70 &&
               edadFinal <= 65;
    }
}
