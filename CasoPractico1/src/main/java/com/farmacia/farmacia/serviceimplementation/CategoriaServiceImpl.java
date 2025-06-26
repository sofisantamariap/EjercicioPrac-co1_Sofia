/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.farmacia.farmacia.serviceimplementation;

/**
 *
 * @author sofisantamaria
 */

import com.farmacia.farmacia.dao.CategoriaDao;
import com.farmacia.farmacia.domain.Categoria;
import com.farmacia.farmacia.service.CategoriaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CategoriaServiceImpl implements CategoriaService {

    @Autowired
    private CategoriaDao categoriaDao;

    @Override
    public List<Categoria> listarTodas() {
        return categoriaDao.findAll();
    }

    @Override
    public Categoria obtenerPorId(Long id) {
        return categoriaDao.findById(id).orElse(null);
    }

    @Override
    public void guardar(Categoria categoria) {
        categoriaDao.save(categoria);
    }

    @Override
    public void eliminar(Long id) {
        categoriaDao.deleteById(id);
    }
}

