package com.sanvalero.ExamenWebinarEntornos.model;

public class DetalleCuadro {

	private static int puntuacion;

	public DetalleCuadro(int puntuacion) {
		super();
		DetalleCuadro.puntuacion = puntuacion;
	}

	public static int getPuntuacion() {
		return puntuacion;
	}

	public static void setPuntuacion(int puntuacion) {
		DetalleCuadro.puntuacion = puntuacion;
	}
}
