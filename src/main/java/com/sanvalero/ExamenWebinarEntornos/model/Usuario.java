package com.sanvalero.ExamenWebinarEntornos.model;

import java.util.ArrayList;
import java.util.List;

public class Usuario {
	
	private String email;
	private String contrasena;
	
	//Lista de usarios registrados
	private List<Usuario> usuarios;
	
	public Usuario(String email, String contrasena) {
		super();
		this.email = email;
		this.contrasena = contrasena;
		
		usuarios = new ArrayList<>();
	}

	/**
	 * Método para registrarse
	 * @param usuario
	 * @return
	 */
	public boolean registro(Usuario usuario) {
		for(Usuario nuevoUsuario : usuarios) {
			if(nuevoUsuario.getEmail().equals(getEmail())) {
				return false;
			}
		}
		usuarios.add(usuario);
		return true;
	}
	/**
	 * Método para puntuar un cuadro
	 * @param usuario
	 * @param cuadro
	 * @param puntos
	 * @throws PuntuacionNoValidaException
	 */
	public boolean puntuar(Usuario usuario, Cuadro cuadro, int puntos)  {
		//int puntuacionTotal = DetalleCuadro.getPuntuacion();
		if(!usuarios.contains(usuario)) {
			System.out.println("Debes registrarte para puntuar");
			return true;
		}
		if((puntos<1) || puntos > 5) {
			return false;
		}else {
			//puntuacionTotal += puntos;
			return true;
		}
		//DetalleCuadro.setPuntuacion(puntuacionTotal);
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
	
	
}
