package ar.edu.unq.po2.tpSolid.banco;

import java.util.ArrayList;
import java.util.List;

public class Banco {
	private List<Cliente> clientes;
	private List<SolicitudCredito> solicitudes;
	
    public Banco() {
        this.clientes = new ArrayList<>();
        this.solicitudes = new ArrayList<>();
    }
    
    public void agregarCliente(Cliente cliente) {
        clientes.add(cliente);
    }

    public void agregarSolicitud(SolicitudCredito solicitud) {
        solicitudes.add(solicitud);
    }
    
    
    
}
