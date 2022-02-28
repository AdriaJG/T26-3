/**
 * 
 */
package com.example.demo.services;

import java.util.List;

import com.example.demo.dto.MaquinasRegistradoras;

/**
 * @author Fenrir
 *
 */
public interface IMaquinasRegistradorasServices {
	public List<MaquinasRegistradoras> obtenerMaquinasRegistradoras();
	
	public MaquinasRegistradoras obtenerMaquinasRegistradorasID(Long id);
	
	public MaquinasRegistradoras guardarMaquinasRegistradoras(MaquinasRegistradoras maquinaRegistradora);
	
	public MaquinasRegistradoras modificarMaquinasRegistradoras(MaquinasRegistradoras maquinaRegistradora);
	
	public void eliminarMaquinasRegistradoras(Long id);
}
