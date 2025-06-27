/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.farmacia.farmacia.serviceimplementation;

import com.farmacia.farmacia.dao.CategoriaDao;
import com.farmacia.farmacia.domain.Categoria;
import com.farmacia.farmacia.service.CategoriaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author sofisantamaria
 */
@Service
public class CategoriaServiceImpl implements CategoriaService {

    @Autowired
    private CategoriaDao categoriaDao;

    @Override
    public List<Categoria> listar() {
        return categoriaDao.findAll();
    }

    @Override
    public Categoria guardar(Categoria categoria) {
        return categoriaDao.save(categoria);
    }

    /**
     *
     * @param id
     */
    @Override
    public void eliminar(Long id) {
        categoriaDao.deleteById(id);
    }

     @Override
    public Categoria buscarPorId(Long id) {
        return categoriaDao.findById(id).orElse(null);
    }
}
