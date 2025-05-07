package ar.edu.unq.po2.tp3;

public class DigitUtils {

    // Devuelve el número con más dígitos pares
    public static int numberWithMostEvenDigits(int[] numbers) {
        int maxEvenDigits = -1;
        int resultNumber = 0;

        for (int number : numbers) {
            int evenCount = countEvenDigits(Math.abs(number)); // Evita problemas con negativos
            if (evenCount > maxEvenDigits) {
                maxEvenDigits = evenCount;
                resultNumber = number;
            }
        }

        return resultNumber;
    }

    // Cuenta cuántos dígitos pares tiene un número
    private static int countEvenDigits(int number) {
        if (number == 0) return 1; // El número 0 tiene 1 dígito, y es par

        int count = 0;
        while (number > 0) {
            int digit = number % 10;
            if (digit % 2 == 0) {
                count++;
            }
            number /= 10;
        }
        return count;
    }

    // Para probar
    public static void main(String[] args) {
        int[] nums = {1234, 2468, 13579, 802, 0, -8642};
        int result = numberWithMostEvenDigits(nums);
        System.out.println("Número con más dígitos pares: " + result); // Debería imprimir 2468 o -8642
    }
}
