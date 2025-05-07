package ar.edu.unq.po2.tp3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

public class MultioperadorTestCase {

    @Test
    public void testSuma() {
        ArrayList<Integer> lista = new ArrayList<>(Arrays.asList(1, 2, 3, 4));
        assertEquals(10, Multioperador.sumar(lista));

        ArrayList<Integer> vacia = new ArrayList<>();
        assertEquals(0, Multioperador.sumar(vacia));
    }

    
    @Test
    public void testResta() {
        ArrayList<Integer> lista = new ArrayList<>(Arrays.asList(10, 3, 2));
        assertEquals(5, Multioperador.restar(lista)); // 10 - 3 - 2

        ArrayList<Integer> vacia = new ArrayList<>();
        assertEquals(0, Multioperador.restar(vacia));

        ArrayList<Integer> unaSola = new ArrayList<>(Arrays.asList(7));
        assertEquals(7, Multioperador.restar(unaSola)); // 7
    }
    

    @Test
    public void testMultiplicacion() {
        ArrayList<Integer> lista = new ArrayList<>(Arrays.asList(2, 3, 4));
        assertEquals(24, Multioperador.multiplicar(lista)); // 2 * 3 * 4

        ArrayList<Integer> vacia = new ArrayList<>();
        assertEquals(0, Multioperador.multiplicar(vacia));

        ArrayList<Integer> contieneCero = new ArrayList<>(Arrays.asList(2, 0, 5));
        assertEquals(0, Multioperador.multiplicar(contieneCero));

        ArrayList<Integer> unaSola = new ArrayList<>(Arrays.asList(9));
        assertEquals(9, Multioperador.multiplicar(unaSola));
    }
    
}
