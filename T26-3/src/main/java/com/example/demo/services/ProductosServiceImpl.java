/**
 * 
 */
package com.example.demo.services;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.IProductosDAO;
import com.example.demo.dto.Productos;

/**
 * @author Fenrir
 *
 */
@Service
public class ProductosServiceImpl implements IProductosServices {
	
	@Autowired
	IProductosDAO iProductosDAO;
	
	@Override
	public List<Productos> obtenerProductos() {
		// TODO Auto-generated method stub
		return iProductosDAO.findAll();
	}

	@Override
	public Productos obtenerProductosID(Long id) {
		// TODO Auto-generated method stub
		return iProductosDAO.findById(id).get();
	}

	@Override
	public Productos guardarProductos(Productos producto) {
		// TODO Auto-generated method stub
		return iProductosDAO.save(producto);
	}

	@Override
	public Productos modificarProductos(Productos producto) {
		// TODO Auto-generated method stub
		return iProductosDAO.save(producto);
	}

	@Override
	public void eliminarProductos(Long id) {
		// TODO Auto-generated method stub
		iProductosDAO.deleteById(id);
	}

}
