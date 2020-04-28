package cml.ejercicio1.entidad;

import java.util.Date;

public class Paciente {
	
	String rut;	
	String nombre;
	String apellido;
	int edad;
	boolean estadoCovid;
	Date fechaDeContagio;
	
	public Paciente(String rut, String nombre, String apellido, int edad, boolean estadoCovid, Date fechaDeContagio) {
		this.rut = rut;
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
		this.estadoCovid = estadoCovid;
		this.fechaDeContagio = fechaDeContagio;
	}
}
