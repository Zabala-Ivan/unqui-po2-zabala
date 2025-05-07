package ar.edu.unq.po2.tp3;

public class Multiplos {

	public static int maximoMultiploComun(int x, int y) {
	    if (x <= 0 || y <= 0) return -1;

	    int minimoComunMultiplo = mcm(x, y);
	    if (minimoComunMultiplo > 1000) return -1;

	    for (int i = 1000; i >= 0; i--) {
	        if (i % minimoComunMultiplo == 0) {
	            return i;
	        }
	    }

	    return -1;
	}

    
    // Máximo común divisor
    private static int mcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
    

    // Mínimo común múltiplo
    private static int mcm(int a, int b) {
        return a * (b / mcd(a, b));
    }

    
    public static void main(String[] args) {
        System.out.println(maximoMultiploComun(3, 9));    // Resultado: 999
        System.out.println(maximoMultiploComun(7, 11));   // Resultado: 924
        System.out.println(maximoMultiploComun(2000, 5)); // Resultado: -1
    }
}