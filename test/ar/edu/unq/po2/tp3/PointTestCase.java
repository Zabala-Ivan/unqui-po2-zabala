package ar.edu.unq.po2.tp3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;


public class PointTestCase {

    @Test
    public void testConstructorConParametros() {
        Point p = new Point(3, 4);
        assertEquals(3, p.getX());
        assertEquals(4, p.getY());
    }

    
    @Test
    public void testConstructorSinParametros() {
        Point p = new Point();
        assertEquals(0, p.getX());
        assertEquals(0, p.getY());
    }
    

    @Test
    public void testMove() {
        Point p = new Point();
        p.move(7, 8);
        assertEquals(7, p.getX());
        assertEquals(8, p.getY());
    }

    
    @Test
    public void testAdd() {
        Point p1 = new Point(2, 3);
        Point p2 = new Point(4, 5);
        Point result = p1.add(p2);

        // Verificamos que el resultado sea correcto
        assertEquals(6, result.getX());
        assertEquals(8, result.getY());

        // Verificamos que los originales no se hayan modificado
        assertEquals(2, p1.getX());
        assertEquals(3, p1.getY());
        assertEquals(4, p2.getX());
        assertEquals(5, p2.getY());
    }
    
}