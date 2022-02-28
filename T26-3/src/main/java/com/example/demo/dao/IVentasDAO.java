package com.example.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.dto.VentaID;
import com.example.demo.dto.Ventas;

public interface IVentasDAO extends JpaRepository<Ventas, VentaID> {

}
