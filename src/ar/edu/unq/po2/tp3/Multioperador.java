package ar.edu.unq.po2.tp3;

import java.util.ArrayList;

public class Multioperador {

    // Suma todos los elementos de la lista
    public static int sumar(ArrayList<Integer> numeros) {
        int suma = 0;
        for (int n : numeros) {
            suma += n;
        }
        return suma;
    }
    

    // Resta todos los elementos de la lista: a1 - a2 - a3 - ...
    public static int restar(ArrayList<Integer> numeros) {
        if (numeros.isEmpty()) return 0;

        int resultado = numeros.get(0);
        for (int i = 1; i < numeros.size(); i++) {
            resultado -= numeros.get(i);
        }
        return resultado;
    }
    

    // Multiplica todos los elementos de la lista
    public static int multiplicar(ArrayList<Integer> numeros) {
        if (numeros.isEmpty()) return 0;

        int producto = 1;
        for (int n : numeros) {
            producto *= n;
        }
        return producto;
    }
    
}

