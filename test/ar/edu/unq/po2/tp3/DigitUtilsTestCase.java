package ar.edu.unq.po2.tp3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class DigitUtilsTestCase {

    @Test
    public void testNumberWithMostEvenDigits_BasicCase() {
        int[] numbers = {1234, 2468, 13579, 802};
        int result = DigitUtils.numberWithMostEvenDigits(numbers);
        assertEquals(2468, result); // 2468 tiene 4 dígitos pares
    }


    @Test
    public void testNumberWithMostEvenDigits_NegativeNumbers() {
        int[] numbers = {-8642, -222, 111};
        int result = DigitUtils.numberWithMostEvenDigits(numbers);
        assertEquals(-8642, result); // -8642 tiene 4 dígitos pares
    }

    
    @Test
    public void testNumberWithMostEvenDigits_Tie() {
        int[] numbers = {2046, 8642}; // ambos tienen 4 dígitos pares
        int result = DigitUtils.numberWithMostEvenDigits(numbers);
        assertEquals(2046, result); // debe devolver el primero en caso de empate
    }

    
    @Test
    public void testNumberWithMostEvenDigits_AllOddDigits() {
        int[] numbers = {135, 777, 999};
        int result = DigitUtils.numberWithMostEvenDigits(numbers);
        assertEquals(135, result); // todos tienen 0 pares, devuelve el primero
    }
}
