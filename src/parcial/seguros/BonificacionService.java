package parcial.seguros;

public interface BonificacionService {
	 /* Devuelve true si el código recibido es válido y está vigente */
	 public boolean códigoVálido(int código);
	 /* Anula el código recibido para que no se pueda re-utilizar */
	 public void anularCódigo(int código);
	 /* Envía un mail a la dirección recibida comunicando que se aplicó una
	 bonificación con el código recibido. */
	 public void notificarTitular (String mailTitular, int código);
}
