/**
 * 
 */
package com.example.demo.services;

import java.util.List;

import com.example.demo.dto.Productos;

/**
 * @author Fenrir
 *
 */
public interface IProductosServices {
	public List<Productos> obtenerProductos();
	
	public Productos obtenerProductosID(Long id);
	
	public Productos guardarProductos(Productos producto);
	
	public Productos modificarProductos(Productos producto);
	
	public void eliminarProductos(Long id);
}
