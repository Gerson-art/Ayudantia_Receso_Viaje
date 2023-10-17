package org.example;

public class Motocicleta {

	private int velocidad = 60;


	public String calcularTiempoViaje(double distancia) {
		double horas = (int) (distancia / velocidad);
		double minutos = (int) ((distancia / velocidad - horas) * 60);
		double segundos = (int) ((distancia / velocidad - horas - minutos / 60.0) * 3600);
		return "Horas: " + horas + " Minutos: " + minutos + " Segundos: " + segundos;
	}
}