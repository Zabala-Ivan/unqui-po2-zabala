package parcial.seguros;

public class Gasto {
    private String concepto;
    private double monto;

    public Gasto(String concepto, double monto) {
        this.concepto = concepto;
        this.monto = monto;
    }

    public double getMonto() {
        return monto;
    }

}
