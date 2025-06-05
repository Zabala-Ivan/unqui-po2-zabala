package parcial.seguros;

public class Item {
    private int cantidad;
    private double valorUnitario;

    public Item(int cantidad, double valorUnitario) {
        this.cantidad = cantidad;
        this.valorUnitario = valorUnitario;
    }

    public double valor() {
        return cantidad * valorUnitario;
    }

    public int getCantidad() {
        return cantidad;
    }
}
