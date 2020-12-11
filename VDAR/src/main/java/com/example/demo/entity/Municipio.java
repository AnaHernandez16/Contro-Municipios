package com.example.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="municipio")
public class Municipio {

		@Id
		@Column(name="nombre_municipio")
		private String nombre_municipio;
		
		@Column(name="estado")
		private String estado;
		
		@Column(name="numero_habitantes")
		private int numero_habitantes;
		
		@Column(name="numero_viviendas")
		private int numero_viviendas;
		
		@Column(name="gobernador")
		private String gobernador;

		@Column(name="PIB")
		private String PIB;

		
		
		
		public String getNombre_municipio() {
			return nombre_municipio;
		}

		public void setNombre_municipio(String nombre_municipio) {
			this.nombre_municipio = nombre_municipio;
		}

		public String getEstado() {
			return estado;
		}

		public void setEstado(String estado) {
			this.estado = estado;
		}

		public int getNumero_habitantes() {
			return numero_habitantes;
		}

		public void setNumero_habitantes(int numero_habitantes) {
			this.numero_habitantes = numero_habitantes;
		}

		public int getNumero_viviendas() {
			return numero_viviendas;
		}

		public void setNumero_viviendas(int numero_viviendas) {
			this.numero_viviendas = numero_viviendas;
		}

		public String getGobernador() {
			return gobernador;
		}

		public void setGobernador(String gobernador) {
			this.gobernador = gobernador;
		}

		public String getPIB() {
			return PIB;
		}

		public void setPIB(String pIB) {
			PIB = pIB;
		}

		

	
}
