package parcial.seguros;

public class Titular {
    private String nombre;
    private String mail;
    
    public Titular(String nombre, String mail) {
        this.nombre = nombre;
        this.mail = mail;
    }


    public String getMail() {
        return mail;
    }
}
