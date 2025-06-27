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
    private ProductoDao dao;

    public List<Producto> listar() {
        return dao.findAll();
    }

    @Override
    public Producto guardar(Producto producto) {
        return dao.save(producto);
    }

    @Override
    public void eliminar(Long id) {
        dao.deleteById(id);
    }
}

