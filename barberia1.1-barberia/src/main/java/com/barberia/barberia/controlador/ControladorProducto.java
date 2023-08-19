package com.barberia.barberia.controlador;

import com.barberia.barberia.interfacesServicios.IServicesProducto;
import com.barberia.barberia.modelo.producto;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping
public class ControladorProducto {

    @Autowired
    private IServicesProducto services;

    @GetMapping("/producto")
    public String listar (Model model){
        List<producto> producto = services.listarProducto();
        model.addAttribute("producto", producto);
        return "producto";
    }

    @GetMapping("/nuevoprodu")
    public String agregar(Model model){
        model.addAttribute("producto", new producto());
        return "moiproducto";
    }

    @PostMapping("/gurdarprodu")
    public String guardar (@Valid producto prod, Model model){
        services.save(prod);
        return "redirect:/producto";

    }

    @PutMapping("/editarprod")
    public String editar (@PathVariable int idProd, Model model){
        Optional<producto> producto = services.listarIdP(idProd);
        model.addAttribute("producto", producto);
        return "moiproducto";
    }
}
