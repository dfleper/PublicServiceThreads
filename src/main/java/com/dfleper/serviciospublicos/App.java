package com.dfleper.serviciospublicos;

public class App {
	public static void main(String[] args) {

		System.out.println(" ");
		System.out.println("Inicio de la Simulacion...");
		System.out.println(" ");

		ServiciosPublicos objServiciosPublicos = new ServiciosPublicos();

		for (int i = 0; i <= 200; i++) {
			Hombre objHombre = new Hombre("Hombre " + i, objServiciosPublicos);
			objHombre.start();
		}

		for (int i = 0; i <= 200; i++) {
			Mujer objMujer = new Mujer("Mujer " + i, objServiciosPublicos);
			objMujer.start();
		}
	}
}