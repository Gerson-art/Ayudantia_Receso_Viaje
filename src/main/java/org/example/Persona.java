package org.example;

import org.example.Automovil;
import org.example.Bicicleta;
import org.example.Motocicleta;

public class Persona {

	private String name;
	private double distancia;

	public Persona(String name) {
		this.name = name;
	}
	public void viajarEnMoto(Motocicleta moto, String destino,double distancia) {
		String tiempo=moto.calcularTiempoViaje(distancia);
		System.out.println("Hola "+this.name+"!, el tiempo de viaje aproximado para llegar a "+destino+" en Motocicleta es de "+tiempo);
	}


	public void viajarEnAuto(Automovil auto, String destino,double distancia) {
		String tiempo=auto.calcularTiempoViaje(distancia);
		System.out.println("Hola "+this.name+"!, el tiempo de viaje aproximado para llegar a "+destino+" en Automovil es de "+tiempo);

	}


	public void viajarEnBici(Bicicleta bici, String destino,double distancia) {
		String tiempo=bici.calcularTiempoViaje(distancia);
		System.out.println("Hola "+this.name+"!, el tiempo de viaje aproximado para llegar a "+destino+" en Bicicleta es de "+tiempo);

	}

}