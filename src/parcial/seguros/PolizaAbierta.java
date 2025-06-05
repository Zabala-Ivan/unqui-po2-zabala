package parcial.seguros;

public class PolizaAbierta extends EstadoPoliza{
    @Override
    public void agregarItem(Poliza poliza, Item item) {
        poliza.agregarAlInventario(item);
    }

    @Override
    public void cerrarInventario(Poliza poliza) {
        poliza.setEstado(new PolizaCerrada());
    }
    
    @Override
    public void bonificar(Poliza poliza) {
    	poliza.agregarGasto(new Gasto("Bonificación Administrativa", -500));
    }
}
