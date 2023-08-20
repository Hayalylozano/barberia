package com.barberia.barberia.controlador;

import com.barberia.barberia.interfacesServicios.IServicesCompra;
import com.barberia.barberia.modelo.compra;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping
public class ControladorCompra {
    @Autowired
    private IServicesCompra services;
    @GetMapping("/compra")
    public  String listar (Model model){
        List<compra> compra=services.listarcompra();
        model.addAttribute("compra",compra);
        return "compra";
    }

    @GetMapping("/nuevocompra")
    public String agregar(Model model){
        model.addAttribute("compra", new compra());
        return "moicompra";
    }

    @PostMapping("/guardarcompra")
    public String guardar(@Valid compra comp, Model model){
        services.save(comp);
        return "redirect:/compra";
    }

    @PutMapping("/editarcompra")
    public String editar(@PathVariable int idComp, Model model){
        Optional<compra> compra =services.listarIdCo(idComp);
        model.addAttribute("compra",compra);
        return "moicompra";
    }

}
