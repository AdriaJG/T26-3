/**
 * 
 */
package com.example.demo.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author Fenrir
 *
 */
@Entity
@Table(name="productos")
public class Productos {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Long codigo;
	@Column(name="nombre")
	String nombre;
	@Column(name="precio")
	int precio;
	
	public Productos(Long codigo, String nombre, int precio) {
		super();
		this.codigo = codigo;
		this.nombre = nombre;
		this.precio = precio;
	}

	public Productos() {
		super();
	}

	public Long getCodigo() {
		return codigo;
	}

	public void setCodigo(Long codigo) {
		this.codigo = codigo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getPrecio() {
		return precio;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}

	@Override
	public String toString() {
		return "Productos [codigo=" + codigo + ", nombre=" + nombre + ", precio=" + precio + "]";
	}

}
