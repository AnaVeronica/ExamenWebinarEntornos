package com.sanvalero.ExamenWebinarEntornos.model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Alumno {

	private String nombre;
	private String apellidos;
	private String curso;
	private String email;
	private LocalDate fechaNacimiento;
	
	//Lista de cuadros del Alumno
	private List<Cuadro> cuadros;
	
	public Alumno(String nombre, String apellidos, String curso, String email, LocalDate fechaNacimiento) {
		super();
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.curso = curso;
		this.email = email;
		this.fechaNacimiento = fechaNacimiento;
		
		cuadros = new ArrayList<>();
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public LocalDate getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(LocalDate fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}
}
