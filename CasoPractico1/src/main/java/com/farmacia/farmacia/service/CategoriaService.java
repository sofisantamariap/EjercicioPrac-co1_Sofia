/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.farmacia.farmacia.service;

import com.farmacia.farmacia.domain.Categoria;
import java.util.List;

/**
 *
 * @author sofisantamaria
 */
public interface CategoriaService {
    List<Categoria> listar();
    Categoria guardar(Categoria categoria);
    void eliminar(Long id);
}

