package org.example;

public class Automovil {

	private double velocidad;

	public Automovil() {
		this.velocidad=40;
	}
	public String calcularTiempoViaje(double distancia) {
			double tiempo = distancia / velocidad;
			int horas = (int) tiempo;
			int minutos = (int) ((tiempo - horas) * 60);
			int segundos = (int) Math.round(((tiempo - horas) * 3600) % 60);
			return "Horas: " + horas + " Minutos: " + minutos + " Segundos: " + segundos;
		}

	}

