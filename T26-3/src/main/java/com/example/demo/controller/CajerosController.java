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

import com.example.demo.dto.Cajeros;
import com.example.demo.services.CajerosServiceImpl;

/**
 * @author Fenrir
 *
 */
@Controller
@RequestMapping("/api")
public class CajerosController {
	
	@Autowired
	
	CajerosServiceImpl cajerosServiceImpl;
	
	@GetMapping("/cajeros")
	public List<Cajeros> obtenerCajeros(){
		return cajerosServiceImpl.obtenerCajeros();
	}
	
	@GetMapping("/cajeros/{id}")
	public Cajeros obtenerCajerosID(@PathVariable(name="id") Long id) {
		return cajerosServiceImpl.obtenerCajerosID(id);
	}
	
	@PostMapping("/cajeros")
	public Cajeros guardarCajero(@RequestBody Cajeros cajero) {
		return cajerosServiceImpl.guardarCajeros(cajero);
	}
	
	@PutMapping("/cajeros/{id}")
	public Cajeros modificarCajeros(@RequestBody Cajeros cajero, @PathVariable(name="id") Long id) {
		Cajeros cajeroSeleccionado = new Cajeros();
		Cajeros cajeroModificado = new Cajeros();
		cajeroSeleccionado = cajerosServiceImpl.obtenerCajerosID(id);
		cajeroSeleccionado.setCodigo(cajero.getCodigo());
		cajeroSeleccionado.setNomApels(cajero.getNomApels());
		return cajeroModificado = cajerosServiceImpl.guardarCajeros(cajeroModificado);
	}
	
	@DeleteMapping("/cajeros/{id}")
	public void eliminarCajeros(@PathVariable(name="id") Long id) {
		cajerosServiceImpl.eliminarCajeros(id);
	}

}
