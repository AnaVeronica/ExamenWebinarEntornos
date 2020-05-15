package com.sanvalero.ExamenWebinarEntornos;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import com.sanvalero.ExamenWebinarEntornos.model.Usuario;

public class UsuarioTests {

	private static Usuario usuario;
	
	@Test
	public void registrarUsuario() {
		
		Usuario usuario1 = new Usuario("usuario1@gmail.com", "123");
		Usuario usuario2 = new Usuario("usuario2@gmail.com", "123");
		
		
		assertEquals(true, usuario.registro(usuario1));
		assertEquals(true, usuario.registro(usuario2));
	}

	@Test
	public void puntuar() {
		
	}
	
}

