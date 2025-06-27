/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.farmacia.farmacia.serviceimplementation;

import com.farmacia.farmacia.dao.QuejaDao;
import com.farmacia.farmacia.domain.Queja;
import com.farmacia.farmacia.service.QuejaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author sofisantamaria
 */
@Service
public class QuejaServiceImpl implements QuejaService {

    @Autowired
    private QuejaDao quejaDao;

    public List<Queja> listar() {
        return quejaDao.findAll();
    }

    @Override
    public Queja guardar(Queja queja) {
        return quejaDao.save(queja);
    }
}
