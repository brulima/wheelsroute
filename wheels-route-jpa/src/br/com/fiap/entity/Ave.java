package br.com.fiap.entity;

import javax.persistence.Entity;

@Entity
public class Ave extends Animal{

	private boolean voa;
	
	private String especie;

	public String getEspecie() {
		return especie;
	}

	public void setEspecie(String especie) {
		this.especie = especie;
	}

	public boolean isVoa() {
		return voa;
	}

	public void setVoa(boolean voa) {
		this.voa = voa;
	}
	
	
	
}
