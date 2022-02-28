/**
 * 
 */
package com.example.demo.services;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.ICajerosDAO;
import com.example.demo.dto.Cajeros;

/**
 * @author Fenrir
 *
 */
@Service
public class CajerosServiceImpl implements ICajerosServices {
	
	@Autowired
	ICajerosDAO iCajerosDAO;
	
	@Override
	public List<Cajeros> obtenerCajeros() {
		// TODO Auto-generated method stub
		return iCajerosDAO.findAll();
	}

	@Override
	public Cajeros obtenerCajerosID(Long id) {
		// TODO Auto-generated method stub
		return iCajerosDAO.findById(id).get();
	}

	@Override
	public Cajeros guardarCajeros(Cajeros cajero) {
		// TODO Auto-generated method stub
		return iCajerosDAO.save(cajero);
	}

	@Override
	public Cajeros modificarCajeros(Cajeros cajero) {
		// TODO Auto-generated method stub
		return iCajerosDAO.save(cajero);
	}

	@Override
	public void eliminarCajeros(Long id) {
		// TODO Auto-generated method stub
		iCajerosDAO.deleteById(id);
	}

}
