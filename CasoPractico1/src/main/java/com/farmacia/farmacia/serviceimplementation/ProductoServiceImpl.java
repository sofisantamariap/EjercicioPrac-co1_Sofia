/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.farmacia.farmacia.serviceimplementation;

import com.farmacia.farmacia.dao.ProductoDao;
import com.farmacia.farmacia.domain.Producto;
import com.farmacia.farmacia.service.ProductoService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author sofisantamaria
 */


@Service
public class ProductoServiceImpl implements ProductoService {

    @Autowired
    private ProductoDao productoDao;

    @Override
    public List<Producto> listarTodos() {
        return productoDao.findAll();
    }

    @Override
    public Producto obtenerPorId(Long id) {
        return productoDao.findById(id).orElse(null);
    }

    @Override
    public void guardar(Producto producto) {
        productoDao.save(producto);
    }

    @Override
    public void eliminar(Long id) {
        productoDao.deleteById(id);
    }
}


