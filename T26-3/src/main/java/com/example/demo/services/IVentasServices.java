/**
 * 
 */
package com.example.demo.services;

import java.util.List;

import com.example.demo.dto.VentaID;
import com.example.demo.dto.Ventas;

/**
 * @author Fenrir
 *
 */
public interface IVentasServices {
	public List<Ventas> obtenerVentas();
	
	public Ventas obtenerVentasID(VentaID id);
	
	public Ventas guardarVentas(Ventas ventas);
	
	public Ventas modificarVentas(Ventas ventas);
	
	public void eliminarVentas(VentaID id);
}
