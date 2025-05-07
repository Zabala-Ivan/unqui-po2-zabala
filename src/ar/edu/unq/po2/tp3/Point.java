package ar.edu.unq.po2.tp3;

public class Point {
    // Atributos para las coordenadas x y y
    private int x;
    private int y;

    // Constructor 1: Crea un punto con valores específicos de x e y
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
    

    // Constructor 2: Crea un punto en la posición (0, 0)
    public Point() {
        this.x = 0;
        this.y = 0;
    }
    

    // Método para mover el punto a nuevas coordenadas
    public void move(int newX, int newY) {
        this.x = newX;
        this.y = newY;
    }
    

    // Método para sumar este punto con otro punto y devolver un nuevo punto
    public Point add(Point otherPoint) {
        int newX = this.x + otherPoint.x;
        int newY = this.y + otherPoint.y;
        return new Point(newX, newY);
    }
    

    // Métodos getter para obtener las coordenadas del punto
    public int getX() {
        return x;
    }
    

    public int getY() {
        return y;
    }
    

    // Método para mostrar las coordenadas del punto en formato (x, y)
    public void print() {
        System.out.println("(" + x + ", " + y + ")");
    }
    
}