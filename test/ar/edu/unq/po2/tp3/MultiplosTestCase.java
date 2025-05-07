package ar.edu.unq.po2.tp3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MultiplosTestCase { 

	@Test
    public void testCasosNormales() {
    assertEquals(999, Multiplos.maximoMultiploComun(3, 9));
    assertEquals(924, Multiplos.maximoMultiploComun(7, 11));
    assertEquals(1000, Multiplos.maximoMultiploComun(10, 100)); // mcm = 100
	}

	
	@Test
	public void testSinMultiploEnRango() {
		assertEquals(-1, Multiplos.maximoMultiploComun(2000, 5)); // MCM = 2000 > 1000
	}
	
	
	@Test
	public void testConValoresInvalidos() {
	    assertEquals(-1, Multiplos.maximoMultiploComun(0, 5));
	    assertEquals(-1, Multiplos.maximoMultiploComun(5, 0));
	    assertEquals(-1, Multiplos.maximoMultiploComun(-3, 6));
	}
	
	
	@Test
	public void testMismosValores() {
		assertEquals(1000, Multiplos.maximoMultiploComun(10, 10)); // MCM = 10, 1000 es múltiplo de 10
	}
	
}

