package ar.edu.unq.po2.tp4;

public class Producto {
    private String nombre;
    private float precio;
    private boolean esPrecioCuidado;

    // Constructor con especificación de precio cuidado
    public Producto(String nombre, float precio, boolean esPrecioCuidado) {
        this.nombre = nombre;
        this.precio = precio;
        this.esPrecioCuidado = esPrecioCuidado;
    }

    // Constructor por defecto: no es precio cuidado
    public Producto(String nombre, float precio) {
        this(nombre, precio, false);
    }

    public String getNombre() {
        return nombre;
    }

    public float getPrecio() {
        return precio;
    }

    public boolean esPrecioCuidado() {
        return esPrecioCuidado;
    }

    public void aumentarPrecio(float aumento) {
        this.precio += aumento;
    }
}
