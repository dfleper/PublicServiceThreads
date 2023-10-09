package com.dfleper.serviciospublicos;

public class ServiciosPublicos {

	private int ServicioHombres, ServicioMujeres;

	public ServiciosPublicos() {
		this.ServicioHombres = 0;
		this.ServicioMujeres = 0;
	}

	synchronized public void EntrarServiciosHombres(String Nombre) {
		while (this.ServicioHombres >= 10) {
			try {
				this.wait();
			} catch (Exception e) {
				e.printStackTrace();
			}

		}
		this.ServicioHombres++;
		System.out.println(Nombre + " esta dentro del servicio. (Cantidad de Hombres en el Servicio: "
				+ this.ServicioHombres + ")");
	}

	synchronized public void SalirServiciosHombres(String Nombre) {
		this.ServicioHombres--;
		System.out.println(
				Nombre + " sale del servicio. (Cantidad de Hombres en el Servicio: " + this.ServicioHombres + ")");
		this.notifyAll();
	}

	synchronized public void EntrarServiciosMujeres(String Nombre) {
		while (this.ServicioMujeres >= 10) {
			try {
				this.wait();
			} catch (Exception e) {
				e.printStackTrace();
			}

		}
		this.ServicioMujeres++;
		System.out.println(Nombre + " esta dentro del servicio. (Cantidad de Mujeres en el Servicio: "
				+ this.ServicioMujeres + ")");

	}

	synchronized public void SalirServiciosMujeres(String Nombre) {
		this.ServicioMujeres--;
		System.out.println(
				Nombre + " sale del servicio. (Cantidad de Mujeres en el Servicio: " + this.ServicioMujeres + ")");
		this.notifyAll();
	}
}