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
	Long cajero;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@ManyToOne
	@JoinColumn(name="maquina")
	Long maquina;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@ManyToOne
	@JoinColumn(name="producto")
	Long producto;
	
	public Ventas(Long cajero, Long maquina, Long producto) {
		super();
		this.cajero = cajero;
		this.maquina = maquina;
		this.producto = producto;
	}

	public Ventas() {
		super();
	}

	public Long getCajero() {
		return cajero;
	}

	public void setCajero(Long cajero) {
		this.cajero = cajero;
	}

	public Long getMaquina() {
		return maquina;
	}

	public void setMaquina(Long maquina) {
		this.maquina = maquina;
	}

	public Long getProducto() {
		return producto;
	}

	public void setProducto(Long producto) {
		this.producto = producto;
	}

	@Override
	public String toString() {
		return "Ventas [cajero=" + cajero + ", maquina=" + maquina + ", producto=" + producto + "]";
	}
	
	
	

}
