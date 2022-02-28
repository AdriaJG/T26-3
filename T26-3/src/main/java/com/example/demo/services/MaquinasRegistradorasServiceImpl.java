/**
 * 
 */
package com.example.demo.services;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.IMaquinasRegistradorasDAO;
import com.example.demo.dto.MaquinasRegistradoras;

/**
 * @author Fenrir
 *
 */
@Service
public class MaquinasRegistradorasServiceImpl implements IMaquinasRegistradorasServices {
	
	@Autowired
	IMaquinasRegistradorasDAO iMaquinasRegistradorasDAO;
	
	@Override
	public List<MaquinasRegistradoras> obtenerMaquinasRegistradoras() {
		// TODO Auto-generated method stub
		return iMaquinasRegistradorasDAO.findAll();
	}

	@Override
	public MaquinasRegistradoras obtenerMaquinasRegistradorasID(Long id) {
		// TODO Auto-generated method stub
		return iMaquinasRegistradorasDAO.findById(id).get();
	}

	@Override
	public MaquinasRegistradoras guardarMaquinasRegistradoras(MaquinasRegistradoras cajero) {
		// TODO Auto-generated method stub
		return iMaquinasRegistradorasDAO.save(cajero);
	}

	@Override
	public MaquinasRegistradoras modificarMaquinasRegistradoras(MaquinasRegistradoras cajero) {
		// TODO Auto-generated method stub
		return iMaquinasRegistradorasDAO.save(cajero);
	}

	@Override
	public void eliminarMaquinasRegistradoras(Long id) {
		// TODO Auto-generated method stub
		iMaquinasRegistradorasDAO.deleteById(id);
	}

}
