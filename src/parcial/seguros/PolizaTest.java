package parcial.seguros;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PolizaTest {

	@Test
	public void testBonificacionEnPolizaVigenteEliminaGastosAdministrativos() {
        
		Titular titular = new Titular("Juan", "juan@mail.com");
        Poliza poliza = new Poliza(titular);
        poliza.agregarItem(new Item(2, 5000));
        poliza.agregarGasto(new Gasto("Gasto 1", 200));
        poliza.agregarGasto(new Gasto("Gasto 2", 300));
        
        // Pasamos a estado Cerrada, luego pagamos para que quede Vigente
        poliza.getEstadoPoliza().cerrarInventario(poliza);
        poliza.getEstadoPoliza().cerrarInventario(poliza);

        // Validación pre-condición: hay gastos administrativos
        assertEquals(2, poliza.getGastos().size());

        // Act: aplicamos una bonificación con código válido
        poliza.bonificar(1234);

        // Assert: los gastos administrativos deben haberse eliminado
        assertEquals(0, poliza.getGastos().size());

	}


}
