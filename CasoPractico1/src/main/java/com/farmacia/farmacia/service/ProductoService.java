/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.farmacia.farmacia.service;

import com.farmacia.farmacia.domain.Producto;
import java.util.List;

/**
 *
 * @author sofisantamaria
 */

public interface ProductoService {
    List<Producto> listarTodos();
    Producto obtenerPorId(Long id);
    void guardar(Producto producto);
    void eliminar(Long id);
}
