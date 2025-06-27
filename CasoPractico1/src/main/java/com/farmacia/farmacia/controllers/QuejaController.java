/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.farmacia.farmacia.controllers;

import com.farmacia.farmacia.domain.Queja;
import com.farmacia.farmacia.service.QuejaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author sofisantamaria
 */

@Controller
@RequestMapping("/quejas")
public class QuejaController {

    @Autowired
    private QuejaService quejaService;

    @GetMapping("/nueva")
    public String mostrarFormulario(Model model) {
        model.addAttribute("queja", new Queja());
        return "formularioQueja";
    }

    @PostMapping("/guardar")
    public String guardarQueja(@ModelAttribute Queja queja) {
        quejaService.guardar(queja);
        return "redirect:/quejas/nueva?exito";
    }
}
