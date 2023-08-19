package com.barberia.barberia.servicios;

import com.barberia.barberia.interfaces.Iproducto;
import com.barberia.barberia.interfacesServicios.IServicesProducto;
import com.barberia.barberia.modelo.producto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;
import java.util.Optional;

@Service
public class ProductoServicio implements IServicesProducto {

    @Autowired
    private Iproducto data;

    @Override
    public List<producto> listarProducto() { return (List<producto>) data.findAll();}

    @Override
    public Optional<producto> listarIdP(int idpd) {return data.findById(idpd);}


    @Override
    public int save(producto prod){
        int res = 0;
        producto producto = data.save(prod);
        if(!producto.equals(null)){
            res = 1;
        }
        return 0;
    }


}
