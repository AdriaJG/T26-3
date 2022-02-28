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

import com.example.demo.dto.MaquinasRegistradoras;
import com.example.demo.services.MaquinasRegistradorasServiceImpl;

/**
 * @author Fenrir
 *
 */
@Controller
@RequestMapping("/api")
public class MaquinasRegistradorasController {
	
	@Autowired
	
	MaquinasRegistradorasServiceImpl maquinasRegistradorasServiceImpl;
	
	@GetMapping("/MaquinasRegistradoras")
	public List<MaquinasRegistradoras> obtenerMaquinasRegistradoras(){
		return maquinasRegistradorasServiceImpl.obtenerMaquinasRegistradoras();
	}
	
	@GetMapping("/MaquinasRegistradoras/{id}")
	public MaquinasRegistradoras obtenerMaquinasRegistradorasID(@PathVariable(name="id") Long id) {
		return maquinasRegistradorasServiceImpl.obtenerMaquinasRegistradorasID(id);
	}
	
	@PostMapping("/MaquinasRegistradoras")
	public MaquinasRegistradoras guardarmaquinaRegistradora(@RequestBody MaquinasRegistradoras maquinaRegistradora) {
		return maquinasRegistradorasServiceImpl.guardarMaquinasRegistradoras(maquinaRegistradora);
	}
	
	@PutMapping("/MaquinasRegistradoras/{id}")
	public MaquinasRegistradoras modificarMaquinasRegistradoras(@RequestBody MaquinasRegistradoras maquinaRegistradora, @PathVariable(name="id") Long id) {
		MaquinasRegistradoras MaquinasRegistradoraseleccionado = new MaquinasRegistradoras();
		MaquinasRegistradoras maquinaRegistradoraModificado = new MaquinasRegistradoras();
		MaquinasRegistradoraseleccionado = maquinasRegistradorasServiceImpl.obtenerMaquinasRegistradorasID(id);
		MaquinasRegistradoraseleccionado.setCodigo(maquinaRegistradora.getCodigo());
		MaquinasRegistradoraseleccionado.setPiso(maquinaRegistradora.getPiso());
		return maquinaRegistradoraModificado = maquinasRegistradorasServiceImpl.guardarMaquinasRegistradoras(maquinaRegistradoraModificado);
	}
	
	@DeleteMapping("/MaquinasRegistradoras/{id}")
	public void eliminarMaquinasRegistradoras(@PathVariable(name="id") Long id) {
		maquinasRegistradorasServiceImpl.eliminarMaquinasRegistradoras(id);
	}

}
