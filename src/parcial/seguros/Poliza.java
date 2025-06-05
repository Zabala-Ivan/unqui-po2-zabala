package parcial.seguros;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Poliza {
	 private List<Item> inventario = new ArrayList<>();
	 private List<Gasto> gastos = new ArrayList<>();
	 private EstadoPoliza estado = new PolizaAbierta();
	 private Titular titular;
	 private BonificacionService bonificacionService;
	
	 
	public Poliza(Titular titular) {
		 this.titular = titular;
	}
	 
	public void agregarItem(Item item) {
		    estado.agregarItem(this, item);
	}

	// Este es el método que realmente modifica la lista
	public void agregarAlInventario(Item item) {
		    inventario.add(item);
	}


	public void eliminarTodosLosGastos() {
		gastos.clear();
	}

	public void setEstado(EstadoPoliza nuevoEstado) {
		this.estado = nuevoEstado;
	}
	
	public void bonificar (int código) {
		if (this.getBonificacionService().códigoVálido(código)) {
			this.getEstadoPoliza().bonificar(this);
			this.getBonificacionService().anularCódigo(código);
			this.getBonificacionService().notificarTitular(this.getmailTitular(), código);
		}
	}

	public BonificacionService getBonificacionService() {
		return bonificacionService;
	}
	
	public EstadoPoliza getEstadoPoliza(){
		return estado;
	}
	
	public String getmailTitular(){
		return this.titular.getMail();
	}
	
    public void agregarGasto(Gasto gasto) {
        gastos.add(gasto);
    }

	public void eliminarGastoMasCaro() {
		gastos.stream().max(Comparator.comparingDouble(Gasto::getMonto)).ifPresent(gastos::remove);
		
	}
	
    public List<Gasto> getGastos() {
        return gastos;
    }
	
}

