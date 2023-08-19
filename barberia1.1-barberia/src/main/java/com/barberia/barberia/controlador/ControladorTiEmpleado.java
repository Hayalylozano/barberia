package com.barberia.barberia.controlador;

import com.barberia.barberia.interfacesServicios.IServicestipoEmpleado;
import com.barberia.barberia.modelo.tipoempleado;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.Banner;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping
public class ControladorTiEmpleado {

    @Autowired
    private IServicestipoEmpleado services;

    @GetMapping("/tipoempleado")
    public String listar (Model model){
        List<tipoempleado> tipoempleado= services.listar();
        model.addAttribute("tipoempleado",tipoempleado);
        return "tipoempleado";
    }

    @GetMapping("/nuevotipoempl")
    public String agregar(Model model){
        model.addAttribute("tipoempleado", new tipoempleado());
        return "moitipoempleado";
    }

    @PostMapping("/guardartiemple")
    public String guardar (@Valid tipoempleado temp, Model model){
        services.save(temp);
        return "redirect:/tipoempleado";
    }
    @PutMapping("/editar/{tip_em_id}")
    public String editar(@PathVariable int idTpEmpl, Model model){
        Optional<tipoempleado> tipoempleado=services.listartipemple(idTpEmpl);
        model.addAttribute("tipoempleado",tipoempleado);
        return "tipoempleado";
    }
}
