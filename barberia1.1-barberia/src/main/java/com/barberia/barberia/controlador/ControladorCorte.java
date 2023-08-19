package com.barberia.barberia.controlador;

import com.barberia.barberia.interfacesServicios.IServicesCortes;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import com.barberia.barberia.modelo.cortes;

import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping
public class ControladorCorte {

    @Autowired
    private IServicesCortes services;

    @GetMapping("/cortes")
    public  String listar (Model model){
        List<cortes> cortes=services.listar();
        model.addAttribute("cortes",cortes);
        return "cortes";
    }

    @GetMapping("/new")
    public String agregar(Model model){
        model.addAttribute("corte", new cortes());
        return "moicortes";
    }

    @PostMapping("/save")
    public String guardar(@Valid cortes p,Model model){
        services.save(p);
        return "redirect:/cortes";
    }

    @PostMapping("/editar/cortes.id_corte")
    public String editar(@PathVariable int id_corte, Model model){
        Optional<cortes>cortes=services.litarId(id_corte);
        model.addAttribute("cortes",cortes);
        return "moicortes";
    }
}
