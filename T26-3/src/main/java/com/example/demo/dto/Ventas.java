/**
 * 
 */
package com.example.demo.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * @author Fenrir
 *
 */
@Entity
@Table(name="venta")
@IdClass(VentaID.class)
public class Ventas {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@ManyToOne
	@JoinColumn(name="cajero")
	private Cajeros cajero;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@ManyToOne
	@JoinColumn(name="maquina")
	private MaquinasRegistradoras maquina;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@ManyToOne
	@JoinColumn(name="producto")
	private Productos producto;
	
	public Ventas(Cajeros cajero, MaquinasRegistradoras maquina, Productos producto) {
		super();
		this.cajero = cajero;
		this.maquina = maquina;
		this.producto = producto;
	}

	public Ventas() {
		super();
	}

	public Cajeros getCajero() {
		return cajero;
	}

	public void setCajero(Cajeros cajero) {
		this.cajero = cajero;
	}

	public MaquinasRegistradoras getMaquina() {
		return maquina;
	}

	public void setMaquina(MaquinasRegistradoras maquina) {
		this.maquina = maquina;
	}

	public Productos getProducto() {
		return producto;
	}

	public void setProducto(Productos producto) {
		this.producto = producto;
	}

	@Override
	public String toString() {
		return "Ventas [cajero=" + cajero + ", maquina=" + maquina + ", producto=" + producto + "]";
	}
}
