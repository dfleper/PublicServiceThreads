package com.dfleper.serviciospublicos;

public class Hombre extends Thread {

	private String Nombre;
	private ServiciosPublicos objServicios;

	public Hombre(String nombre, ServiciosPublicos objServiciosPublicos) {
		Nombre = nombre;
		this.objServicios = objServiciosPublicos;
	}

	@Override
	public void run() {
		this.objServicios.EntrarServiciosHombres(this.Nombre);
		try {
			Thread.sleep(250);
		} catch (Exception e) {
			e.printStackTrace();
		}
		this.objServicios.SalirServiciosHombres(this.Nombre);
	}
}