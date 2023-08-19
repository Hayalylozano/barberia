package com.barberia.barberia.controlador;

import com.barberia.barberia.interfacesServicios.IServicesEmpleado;
import com.barberia.barberia.modelo.empleado;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping
public class ControladoEmpleado {

    @Autowired
    private IServicesEmpleado services;

    @GetMapping("/empleado")
    public String listar (Model model){
        List<empleado> empleado = services.listar();
        model.addAttribute("empleado",empleado);
        return "empleado";
    }

    @GetMapping("/nuevoempleado")
    public String agregar(Model model){
        model.addAttribute("empleado",new empleado());
        return "moiempleado";
    }
    @PostMapping("/guardaremple")
    public String guardar(@Valid empleado em,Model model){
        services.save(em);
        return ("redirect:/empleado");
    }
}
