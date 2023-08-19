package com.barberia.barberia.controlador;

import com.barberia.barberia.interfacesServicios.IServicesCliente;
import com.barberia.barberia.modelo.clientes;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping
public class ControladorCliente {

    @Autowired
    private IServicesCliente services;

    @GetMapping("/clientes")
    public String listarcliente (Model model){
        List<clientes> cliente = services.listarcliente();
        model.addAttribute("clientes",cliente);
        return "clientes";
    }

    @GetMapping("/nuevocliente")
    public String agregar(Model model){
        model.addAttribute("clientes",new clientes());
        return "moicliente";
    }

    @PostMapping("/guardarcli")
    public String guardar(@Valid clientes c, Model model){
        services.save(c);
        return "redirect:/clientes";
    }
    @PostMapping("/ditar")
    public String editar (@PathVariable int idCliente, Model model){
        Optional<clientes> clientes = services.listarid(idCliente);
        model.addAttribute("clientes",clientes);
        return "moicliente";
    }

}
