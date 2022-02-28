/**
 * 
 */
package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.dto.Productos;
import com.example.demo.services.ProductosServiceImpl;

/**
 * @author Fenrir
 *
 */
@Controller
@RequestMapping("/api")
public class ProductosController {
	
	@Autowired
	
	ProductosServiceImpl productosServiceImpl;
	
	@GetMapping("/productos")
	public List<Productos> obtenerProductos(){
		return productosServiceImpl.obtenerProductos();
	}
	
	@GetMapping("/productos/{id}")
	public Productos obtenerProductosID(@PathVariable(name="id") Long id) {
		return productosServiceImpl.obtenerProductosID(id);
	}
	
	@PostMapping("/productos")
	public Productos guardarCajero(@RequestBody Productos producto) {
		return productosServiceImpl.guardarProductos(producto);
	}
	
	@PutMapping("/productos/{id}")
	public Productos modificarProductos(@RequestBody Productos producto, @PathVariable(name="id") Long id) {
		Productos productoSeleccionado = new Productos();
		Productos productoModificado = new Productos();
		productoSeleccionado = productosServiceImpl.obtenerProductosID(id);
		productoSeleccionado.setCodigo(producto.getCodigo());
		productoSeleccionado.setNombre(producto.getNombre());
		productoSeleccionado.setPrecio(producto.getPrecio());
		return productoModificado = productosServiceImpl.guardarProductos(productoModificado);
	}
	
	@DeleteMapping("/productos/{id}")
	public void eliminarProductos(@PathVariable(name="id") Long id) {
		productosServiceImpl.eliminarProductos(id);
	}

}
