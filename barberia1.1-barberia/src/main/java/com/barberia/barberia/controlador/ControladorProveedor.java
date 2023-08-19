package com.barberia.barberia.controlador;

import com.barberia.barberia.interfacesServicios.IServicioProveedor;
import com.barberia.barberia.modelo.proveedor;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping
public class ControladorProveedor {
    @Autowired
    private IServicioProveedor services;

    @GetMapping("/proveedor")
    public String listar (Model model){
        List<proveedor>proveedor = services.listar();
        model.addAttribute("proveedor",proveedor);
        return "proveedor";
    }
    @GetMapping("/nuevoprov")
    public String agregar(Model model){
        model.addAttribute("proveedor", new proveedor());
        return "moiproveedor";
    }
    @PostMapping("/guardarprov")
    public String guardar(@Valid proveedor pro, Model model){
        services.save(pro);
        return "redirect:/proveedor";
    }
    @PutMapping("/editarpro")
    public String editar(@PathVariable int idPro, Model model){
        Optional<proveedor> proveedor=services.listarid(idPro);
        model.addAttribute("proveedor",proveedor);
        return "moiproveedor";
    }
}
