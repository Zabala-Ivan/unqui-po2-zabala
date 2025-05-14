package ar.edu.unq.po2.tp4;

public class ProductoPrimeraNecesidad extends Producto{
    private static final float DESCUENTO = 0.9f; // 10% de descuento

    public ProductoPrimeraNecesidad(String nombre, float precio, boolean esPrecioCuidado) {
        super(nombre, precio, esPrecioCuidado);
    }

    @Override
    public float getPrecio() {
        return super.getPrecio() * DESCUENTO;
    }
}
