package ar.edu.unq.po2.tpSolid.banco;

public class Cliente {
	private String nombre;
	private String apellido;
	private String direccion;
	private int edad;
	private double sueldoMensual;
	
	public Cliente(String nombre, String apellido, String direccion, int edad, double sueldoMensual) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.direccion = direccion;
		this.edad = edad;
		this.sueldoMensual = sueldoMensual;		
	}

	public String getNombre() {
		return nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public String getDireccion() {
		return direccion;
	}

	public int getEdad() {
		return edad;
	}

	public double getSueldoMensual() {
		return sueldoMensual;
	}
	
	public double getSueldoAnual() {
		return sueldoMensual * 12;
	}
	
}
