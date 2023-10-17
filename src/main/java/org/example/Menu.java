package org.example;

import java.util.InputMismatchException;
import java.util.Scanner;
public class Menu {
    Scanner sc;
    StringValidator stringvalidator;

    public Menu() {
        this.sc = new Scanner(System.in);
        this.stringvalidator = new StringValidator();
    }


    public void menu() {
        boolean valorvalid = false;
        String nombre="";
        String destino="";
        double distancia=0;
        int opcion=0;

        do {
            try {
                System.out.println("Bienvenido al sistema de estimacion de duracion de viaje");
                System.out.println("Ingresa tu nombre: ");
                nombre = sc.nextLine();
                this.stringvalidator.esStringValido(nombre);
                valorvalid = true;

            } catch (ExcepcionString r) {
                System.err.println(r.getMessage());
                sc.nextLine();}
            }while(!valorvalid);
            valorvalid = false;
            do {
                try {
                    System.out.println("Ingresa tu destino:");
                    destino = sc.nextLine();
                    this.stringvalidator.esStringValido(destino);
                    valorvalid = true;
                } catch (ExcepcionString a) {
                    System.err.println(a.getMessage());
                    sc.nextLine();
                }
            } while (!valorvalid);
            valorvalid = false;
            do {
                try {
                    System.out.println("Ingresa la distancia a la cual se encuentra tu destino: ");
                    distancia = sc.nextDouble();
                    valorvalid = true;
                } catch (InputMismatchException e) {
                    System.err.println("Ingresa un valor válido para la distancia");
                    sc.nextLine();
                }
            } while (!valorvalid);
            valorvalid = false;
            do {
                try {
                    System.out.println("Seleccione la opcion asociada al medio de transporte que desea utilizar para llegar a " + destino);
                    System.out.println("1. Motocicleta");
                    System.out.println("2. Automovil");
                    System.out.println("3. Bicicleta");
                    System.out.println("4. Salir");
                    opcion = sc.nextInt();
                    valorvalid = true;
                } catch (InputMismatchException e1) {
                    System.err.println("Ingresa un valor válido para la opcion elegida");
                    sc.nextLine();
                }
            } while (!valorvalid);
            valorvalid = false;
                switch (opcion) {
                    case 1:
                        Persona persona = new Persona(nombre);
                        Motocicleta moto = new Motocicleta();
                        persona.viajarEnMoto(moto,destino,distancia);
                        break;
                    case 2:
                        Persona persona2 = new Persona(nombre);
                        Automovil auto = new Automovil();
                        persona2.viajarEnAuto(auto,destino,distancia);
                        break;
                    case 3:
                        Persona persona3 = new Persona(nombre);
                        Bicicleta bici = new Bicicleta();
                        persona3.viajarEnBici(bici,destino,distancia);
                        break;
                    case 4:
                        System.out.println("Hasta luego Usuario!");
                        break;

                    default:
                        System.out.println("No ha seleccionado una opcion valida");

                }
    }
}
