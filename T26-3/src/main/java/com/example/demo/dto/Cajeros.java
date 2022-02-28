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
@Table(name="cajeros")
public class Cajeros {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long codigo;
	@Column(name="nomapels")
	private String nomApels;
	
	public Cajeros(Long codigo, String nomApels) {
		super();
		this.codigo = codigo;
		this.nomApels = nomApels;
	}

	public Cajeros() {
		super();
	}

	public Long getCodigo() {
		return codigo;
	}

	public void setCodigo(Long codigo) {
		this.codigo = codigo;
	}

	public String getNomApels() {
		return nomApels;
	}

	public void setNomApels(String nomApels) {
		this.nomApels = nomApels;
	}

	@Override
	public String toString() {
		return "Cajeros [codigo=" + codigo + ", nomApels=" + nomApels + "]";
	}

}
