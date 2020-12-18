package models;

public class Participante {
	private Integer numInscripto;
	private String nombre;
	private String apellido;
	private Integer dni;
	private String mail;
	
	
	public Participante(Integer numInscripto, String nombre, String apellido, Integer dni, String mail) {
		super();
		this.numInscripto = numInscripto;
		this.nombre = nombre;
		this.apellido = apellido;
		this.dni = dni;
		this.mail = mail;
	}

	public Integer getNumInscripto() {
		return numInscripto;
	}
	
	public void setNumInscripto(Integer numInscripto) {
		this.numInscripto = numInscripto;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String getApellido() {
		return apellido;
	}
	
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	
	public Integer getDni() {
		return dni;
	}
	
	public void setDni(Integer dni) {
		this.dni = dni;
	}
	
	public String getMail() {
		return mail;
	}
	
	public void setMail(String mail) {
		this.mail = mail;
	}

	@Override
	public String toString() {
		return "Participante: numInscripto=" + numInscripto + "\n nombre=" + nombre + "\n apellido=" + apellido + "\n dni="
				+ dni + "\n mail=" + mail + "\n // ";
	}
	
	
}
