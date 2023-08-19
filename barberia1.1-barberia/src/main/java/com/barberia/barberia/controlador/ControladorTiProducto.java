package com.barberia.barberia.controlador;

import com.barberia.barberia.interfacesServicios.IServicetipoProducto;
import com.barberia.barberia.modelo.tipoproducto;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.expression.spel.ast.OpAnd;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping
public class ControladorTiProducto {

    @Autowired
    private IServicetipoProducto services;

    @GetMapping("/tipoprodu")
    public String listarTipo (Model model){
        List<tipoproducto> tipoproductos= services.listartipoprod();
        model.addAttribute("tipoproductos",tipoproductos);
        return "tipoprodu";
    }

    @GetMapping("/nuevotipopro")
    public  String agregar (Model model){
        model.addAttribute("tipoproducto",new tipoproducto());
        return "moitipoproducto";
    }

    @PostMapping("/guardartiprod")
    public String guardar(@Valid tipoproducto ti,Model model){
        services.savetipoproducto(ti);
        return "redirect:/tipoprodu";
    }

    @PutMapping("/editar")
    public String editar (@PathVariable int idtiPro, Model model){
        Optional<tipoproducto> tipoproducto= services.listarIdT(idtiPro);
        model.addAttribute("tipoproducto",tipoproducto);
        return "moitipoproducto";
    }
}
