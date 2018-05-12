package br.com.controle_aereo_deev.web;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

import br.com.controle_aereo_deev.radar.Radar;

@ManagedBean(name = "cordenadasBean")
@RequestScoped
public class CordenadasBean {
	
	
	private int X = 1600;
	private int Y = 900;
	private Radar radar = new Radar(X/2, Y/2);
	
	
	public String atualizaRadar()
	{
	  this.radar = new Radar(X/2, Y/2, 50, 60);
	  return null;
	}
	
	
	public Radar getRadar() {
		return radar;
	}

	public void setRadar(Radar radar) {
		this.radar = radar;
	}

	public int getX() {
		return X;
	}

	public void setX(int x) {
		X = x;
	}

	public int getY() {
		return Y;
	}

	public void setY(int y) {
		Y = y;
	}
	
	
	
	
	
	
	
}
