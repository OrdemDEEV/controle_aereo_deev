package br.com.controle_aereo_deev.polar;

import java.io.Serializable;

public class Polar implements Serializable{
	
	
	private static final long serialVersionUID = 7189204875639290867L;
	
	
	private double raio;
	private double angulo;
	
	
	public double getRaio() {
		return raio;
	}
	public void setRaio(double raio) {
		this.raio = raio;
	}
	public double getAngulo() {
		return angulo;
	}
	public void setAngulo(double angulo) {
		this.angulo = angulo;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(angulo);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(raio);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Polar other = (Polar) obj;
		if (Double.doubleToLongBits(angulo) != Double.doubleToLongBits(other.angulo))
			return false;
		if (Double.doubleToLongBits(raio) != Double.doubleToLongBits(other.raio))
			return false;
		return true;
	}
	
	

}
