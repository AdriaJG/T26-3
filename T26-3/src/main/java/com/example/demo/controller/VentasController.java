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

import com.example.demo.dto.VentaID;
import com.example.demo.dto.Ventas;
import com.example.demo.services.VentasServiceImpl;

/**
 * @author Fenrir
 *
 */
@Controller
@RequestMapping("/api")
public class VentasController {
	
	@Autowired
	
	VentasServiceImpl ventasServiceImpl;
	
	@GetMapping("/ventas")
	public List<Ventas> obtenerVentas(){
		return ventasServiceImpl.obtenerVentas();
	}
	
	@GetMapping("/ventas/{id}")
	public Ventas obtenerVentasID(@PathVariable(name="id") VentaID id) {
		return ventasServiceImpl.obtenerVentasID(id);
	}
	
	@PostMapping("/ventas")
	public Ventas guardarCajero(@RequestBody Ventas venta) {
		return ventasServiceImpl.guardarVentas(venta);
	}
	
	@PutMapping("/ventas/{id}")
	public Ventas modificarVentas(@RequestBody Ventas venta, @PathVariable(name="id") VentaID id) {
		Ventas ventaSeleccionado = new Ventas();
		Ventas ventaModificado = new Ventas();
		ventaSeleccionado = ventasServiceImpl.obtenerVentasID(id);
		ventaSeleccionado.setCajero(venta.getCajero());
		ventaSeleccionado.setMaquina(venta.getMaquina());
		ventaSeleccionado.setProducto(venta.getProducto());
		return ventaModificado = ventasServiceImpl.guardarVentas(ventaModificado);
	}
	
	@DeleteMapping("/ventas/{id}")
	public void eliminarVentas(@PathVariable(name="id") VentaID id) {
		ventasServiceImpl.eliminarVentas(id);
	}

}
