package com.sanvalero.ExamenWebinarEntornos.model;

import java.util.ArrayList;
import java.util.List;

public class Cuadro {

	private String nombre;
	private String tecnica;
	private int ancho;
	private int alto;
	
	private Alumno alumno;
	private List<DetalleCuadro> detalles;

	public Cuadro(String nombre, String tecnica, int ancho, int alto, Alumno alumno) {
		super();
		this.nombre = nombre;
		this.tecnica = tecnica;
		this.ancho = ancho;
		this.alto = alto;
		this.alumno = alumno;
		
		detalles = new ArrayList<>();
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getTecnica() {
		return tecnica;
	}

	public void setTecnica(String tecnica) {
		this.tecnica = tecnica;
	}

	public int getAncho() {
		return ancho;
	}

	public void setAncho(int ancho) {
		this.ancho = ancho;
	}

	public int getAlto() {
		return alto;
	}

	public void setAlto(int alto) {
		this.alto = alto;
	}

	public Alumno getAlumno() {
		return alumno;
	}

	public void setAlumno(Alumno alumno) {
		this.alumno = alumno;
	}
	
}
