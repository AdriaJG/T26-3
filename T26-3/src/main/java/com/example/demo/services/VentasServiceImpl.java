/**
 * 
 */
package com.example.demo.services;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.IVentasDAO;
import com.example.demo.dto.Ventas;

/**
 * @author Fenrir
 *
 */
@Service
public class VentasServiceImpl implements IVentasServices {
	
	@Autowired
	IVentasDAO iVentasDAO;
	
	@Override
	public List<Ventas> obtenerVentas() {
		// TODO Auto-generated method stub
		return iVentasDAO.findAll();
	}

	@Override
	public Ventas obtenerVentasID(Long id) {
		// TODO Auto-generated method stub
		return iVentasDAO.findById(id).get();
	}

	@Override
	public Ventas guardarVentas(Ventas cajero) {
		// TODO Auto-generated method stub
		return iVentasDAO.save(cajero);
	}

	@Override
	public Ventas modificarVentas(Ventas cajero) {
		// TODO Auto-generated method stub
		return iVentasDAO.save(cajero);
	}

	@Override
	public void eliminarVentas(Long id) {
		// TODO Auto-generated method stub
		iVentasDAO.deleteById(id);
	}

}
