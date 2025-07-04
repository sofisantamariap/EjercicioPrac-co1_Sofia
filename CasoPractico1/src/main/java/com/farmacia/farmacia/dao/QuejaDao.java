/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.farmacia.farmacia.dao;

import com.farmacia.farmacia.domain.Queja;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author sofisantamaria
 */
@Repository
public interface QuejaDao extends JpaRepository<Queja, Long> {
}