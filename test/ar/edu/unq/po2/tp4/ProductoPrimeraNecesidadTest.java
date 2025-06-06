package ar.edu.unq.po2.tp4;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


public class ProductoPrimeraNecesidadTest {

    private ProductoPrimeraNecesidad leche;

    @BeforeEach
    public void setUp() {
        leche = new ProductoPrimeraNecesidad("Leche", 8.0f, false);
    }

    @Test
    public void testCalcularPrecio() {
        assertEquals(7.2f, leche.getPrecio(), 0.0001f);
    }
}