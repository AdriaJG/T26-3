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
@Table(name="maquinasregitradoras")
public class MaquinasRegistradoras {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long codigo;
	@Column(name="piso")
	private int piso;
	
	public MaquinasRegistradoras(Long codigo, int piso) {
		super();
		this.codigo = codigo;
		this.piso = piso;
	}

	public MaquinasRegistradoras() {
		super();
	}

	public Long getCodigo() {
		return codigo;
	}

	public void setCodigo(Long codigo) {
		this.codigo = codigo;
	}

	public int getPiso() {
		return piso;
	}

	public void setPiso(int piso) {
		this.piso = piso;
	}

	@Override
	public String toString() {
		return "MaquinasRegistradoras [codigo=" + codigo + ", piso=" + piso + "]";
	}
	
	

}
