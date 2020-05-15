package com.sanvalero.ExamenWebinarEntornos.model;

import java.util.ArrayList;
import java.util.List;

public class Colegio {

	private String nombre;
	private String direccion;
	private String email;
	private String contrasena;
	private String personaContacto;
	
	//Lista de alumnos incritos en el concurso
	private List<Alumno> alumnos;
	//Lista de cuadros añadidos
	private List<Cuadro> cuadros;
	
	public Colegio(String nombre, String direccion, String email, String contrasena, String personaContacto) {
		super();
		this.nombre = nombre;
		this.direccion = direccion;
		this.email = email;
		this.contrasena = contrasena;
		this.personaContacto = personaContacto;
		
		alumnos = new ArrayList<>();
		cuadros = new ArrayList<>();
	}

	/**
	 * Método para registrar un alumno
	 * @param alumno
	 * @return
	 */
	public boolean registrarAlumno(Alumno alumno){
		for(Alumno nuevoAlumno : alumnos) {
			if(nuevoAlumno.getNombre().equals(alumno.getNombre())){
				return false;
				
			}else if (alumno.getNombre() == null) {
				return false;
			}
		}
		alumnos.add(alumno);
		return true;
	}
	
	/**
	 * Método para añadir información sobre un cuadro
	 * @param cuadro
	 * @return
	 */
	public boolean informacionCuadro(Cuadro cuadro) {
		for(Cuadro nuevoCuadro : cuadros) {
			if(nuevoCuadro.getNombre() == null) {
				return false;
			}
		}
		cuadros.add(cuadro);
		return true;
	}
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getContrasena() {
		return contrasena;
	}

	public void setContrasena(String contrasena) {
		this.contrasena = contrasena;
	}

	public String getPersonaContacto() {
		return personaContacto;
	}

	public void setPersonaContacto(String personaContacto) {
		this.personaContacto = personaContacto;
	}
	
}
