package ar.edu.unq.po2.tp3;

import java.util.ArrayList;
import java.util.List;

public class Counter {
    private List<Integer> numbers;

    public Counter() {
        this.numbers = new ArrayList<>();
    }

    public void addNumber(int number) {
        numbers.add(number);
    }

    public int countEvenNumbers() {
        int count = 0;
        for (int number : numbers) {
            if (number % 2 == 0) {
                count++;
            }
        }
        return count;
    }

    public int countOddNumbers() {
        int count = 0;
        for (int number : numbers) {
            if (number % 2 != 0) {
                count++;
            }
        }
        return count;
    }

    public int countMultiplesOf(int divisor) {
        int count = 0;
        for (int number : numbers) {
            if (divisor != 0 && number % divisor == 0) {
                count++;
            }
        }
        return count;
    }

    
}