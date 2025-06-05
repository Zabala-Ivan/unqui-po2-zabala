package parcial.seguros;

public class PolizaCerrada extends EstadoPoliza{
    @Override
    public void agregarItem(Poliza poliza, Item item) {
        poliza.agregarAlInventario(item);
        double recargo = item.valor() * 0.03 * item.getCantidad();
        poliza.agregarGasto(new Gasto("Recargo por extensión", recargo));
    }

    @Override
    public void pagar(Poliza poliza) {
        poliza.setEstado(new PolizaVigente());
    }
    
    @Override
    public void bonificar(Poliza poliza) {
    	poliza.eliminarGastoMasCaro();
    }
}
