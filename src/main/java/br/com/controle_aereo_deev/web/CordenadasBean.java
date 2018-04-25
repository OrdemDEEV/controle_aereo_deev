package br.com.controle_aereo_deev.web;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

import br.com.controle_aereo_deev.radar.Radar;

@ManagedBean(name = "cordenadasBean")
@RequestScoped
public class CordenadasBean {
	
	private Radar radar = new Radar();
	private String javaScript = new String();
	
	
	
	public Radar getRadar() {
		return radar;
	}

	public void setRadar(Radar radar) {
		this.radar = radar;
	}

	public String getJavaScript() {
		return radar.getJavaScript();
	}

	public void setJavaScript(String javaScript) {
		this.javaScript = javaScript;
	}
	
	
	
}
