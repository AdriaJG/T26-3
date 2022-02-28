package com.example.demo.dto;

import java.io.Serializable;

import javax.persistence.Column;

public class VentaID implements Serializable {
	@Column(name="cajero")
	Long cajero;
	@Column(name="maquina")
	Long maquina;
	@Column(name="producto")
	Long producto;
	
	public VentaID() {
		
	}

	public VentaID(Long cajero, Long maquina, Long producto) {
		super();
		this.cajero = cajero;
		this.maquina = maquina;
		this.producto = producto;
	}
	
	
}
