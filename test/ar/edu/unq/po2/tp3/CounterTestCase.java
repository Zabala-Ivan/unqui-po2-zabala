package ar.edu.unq.po2.tp3;

import static org.junit.jupiter.api.Assertions.*;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CounterTestCase {

    private Counter counter;

    @BeforeEach
    public void setUp() {
        counter = new Counter();
        counter.addNumber(1);
        counter.addNumber(2);
        counter.addNumber(3);
        counter.addNumber(4);
        counter.addNumber(5);
        counter.addNumber(6);
    }

    @Test
    public void testCountEvenNumbers() {
        assertEquals(3, counter.countEvenNumbers()); // 2, 4, 6
    }

    @Test
    public void testCountOddNumbers() {
        assertEquals(3, counter.countOddNumbers()); // 1, 3, 5
    }

    @Test
    public void testCountMultiplesOfThree() {
        assertEquals(2, counter.countMultiplesOf(3)); // 3, 6
    }

    @Test
    public void testCountMultiplesOfTwo() {
        assertEquals(3, counter.countMultiplesOf(2)); // 2, 4, 6
    }

    @Test
    public void testCountMultiplesOfFive() {
        assertEquals(1, counter.countMultiplesOf(5)); // 5
    }

    @Test
    public void testCountMultiplesOfZero() {
        assertEquals(0, counter.countMultiplesOf(0)); // no se divide por cero
    }
}