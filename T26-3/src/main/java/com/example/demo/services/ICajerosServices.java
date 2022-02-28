/**
 * 
 */
package com.example.demo.services;

import java.util.List;

import com.example.demo.dto.Cajeros;

/**
 * @author Fenrir
 *
 */
public interface ICajerosServices {
	public List<Cajeros> obtenerCajeros();
	
	public Cajeros obtenerCajerosID(Long id);
	
	public Cajeros guardarCajeros(Cajeros cajero);
	
	public Cajeros modificarCajeros(Cajeros cajero);
	
	public void eliminarCajeros(Long id);
}
