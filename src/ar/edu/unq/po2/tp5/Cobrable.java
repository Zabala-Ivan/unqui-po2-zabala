package ar.edu.unq.po2.tp5;

public interface Cobrable {
	
	double calcularMonto();
	void registrarEnCaja(Caja c);
	
	//este método lo debe de implementar la caja en su método registrarTotal usando su lista de de cobrables
	default void registrarPago(Agencia a) {
		a.registrarPago(this);
	}
	
}
