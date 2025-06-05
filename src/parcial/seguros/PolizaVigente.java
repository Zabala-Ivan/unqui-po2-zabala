package parcial.seguros;

public class PolizaVigente extends EstadoPoliza{
    @Override
    public void cancelar(Poliza poliza) {
        poliza.eliminarTodosLosGastos();
        poliza.setEstado(new PolizaAbierta());
    }
    
    @Override
    public void bonificar(Poliza poliza) {
    	poliza.eliminarTodosLosGastos();
    }
}
