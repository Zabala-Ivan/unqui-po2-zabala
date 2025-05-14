package ar.edu.unq.po2.tp4;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class SupermercadoTest {

    private Supermercado supermercado;

    @BeforeEach
    public void setUp() {
        supermercado = new Supermercado(); // supermercado sin nombre ni dirección
    }

    @Test
    public void testSupermercadoEmpiezaSinProductos() {
        assertEquals(0, supermercado.getCantidadDeProductos());
    }

    @Test
    public void testAgregarProductoIncrementeCantidad() {
        supermercado.agregarProducto(new Producto("Leche", 100.0f));
        assertEquals(1, supermercado.getCantidadDeProductos());

        supermercado.agregarProducto(new Producto("Pan", 50.0f));
        assertEquals(2, supermercado.getCantidadDeProductos());
    }

    @Test
    public void testPrecioTotalDeProductos() {
        supermercado.agregarProducto(new Producto("Fideos", 25.5f));
        supermercado.agregarProducto(new Producto("Arroz", 74.5f));
        assertEquals(100.0, supermercado.getPrecioTotal(), 0.01); // margen por decimales
    }
}