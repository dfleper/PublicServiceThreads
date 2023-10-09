package com.dfleper.serviciospublicos;

public class Mujer extends Thread {

	private String Nombre;
	private ServiciosPublicos objServicios;

	public Mujer(String nombre, ServiciosPublicos objServiciosPublicos) {
		Nombre = nombre;
		this.objServicios = objServiciosPublicos;
	}

	@Override
	public void run() {
		this.objServicios.EntrarServiciosMujeres(this.Nombre);
		try {
			Thread.sleep(250);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		this.objServicios.SalirServiciosMujeres(Nombre);
	}
}