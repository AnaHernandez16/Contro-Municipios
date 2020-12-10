package com.example.demo.entity;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="casa")
public class Casa {

	@Id
	@Column(name="numero_casa")
	private int numero_casa;
	
	@Column(name="municipio")
	private String municipio;
	
	@Column(name="codigo_postal")
	private String codigo_postal;
	
	@Column(name="hipoteca")
	private double hipoteca;
	
	@Column(name="direccion")
	private String direccion;

	public int getNumero_casa() {
		return numero_casa;
	}

	public void setNumero_casa(int numero_casa) {
		this.numero_casa = numero_casa;
	}

	public String getMunicipio() {
		return municipio;
	}

	public void setMunicipio(String municipio) {
		this.municipio = municipio;
	}

	public String getCodigo_postal() {
		return codigo_postal;
	}

	public void setCodigo_postal(String codigo_postal) {
		this.codigo_postal = codigo_postal;
	}

	public double getHipoteca() {
		return hipoteca;
	}

	public void setHipoteca(double hipoteca) {
		this.hipoteca = hipoteca;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	
	
}

