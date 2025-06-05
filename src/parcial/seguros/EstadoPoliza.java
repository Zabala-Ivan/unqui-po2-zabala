package parcial.seguros;

public abstract class EstadoPoliza {
    public void agregarItem(Poliza poliza, Item item) {}
    public void cerrarInventario(Poliza poliza) {}
    public void pagar(Poliza poliza) {}
    public void cancelar(Poliza poliza) {}
    public void bonificar(Poliza poliza) {}
}
