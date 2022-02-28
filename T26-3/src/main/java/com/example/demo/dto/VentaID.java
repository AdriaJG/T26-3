package com.example.demo.dto;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

public class VentaID implements Serializable {
	@ManyToOne
	@JoinColumn(name="cajero")
	Cajeros cajero;
	@ManyToOne
	@JoinColumn(name="maquina")
	MaquinasRegistradoras maquina;
	@ManyToOne
	@JoinColumn(name="producto")
	Productos producto;
	
	public VentaID() {
		
	}

	public VentaID(Cajeros cajero, MaquinasRegistradoras maquina, Productos producto) {
		super();
		this.cajero = cajero;
		this.maquina = maquina;
		this.producto = producto;
	}
	
}
