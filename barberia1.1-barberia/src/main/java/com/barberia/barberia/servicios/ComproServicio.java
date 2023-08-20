package com.barberia.barberia.servicios;

import com.barberia.barberia.interfaces.Icompra;
import com.barberia.barberia.interfacesServicios.IServicesCompra;
import com.barberia.barberia.modelo.compra;
import com.barberia.barberia.modelo.empleado;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ComproServicio implements IServicesCompra {
    @Autowired
    private Icompra data;

    @Override
    public List<compra> listarcompra() {
        return (List<compra>) data.findAll();
    }

    @Override
    public Optional<compra> listarIdCo(int idC) {
        return data.findById(idC);
    }

    @Override
    public int save(compra comp) {
        int em =0;
        compra compra=data.save(comp);
        if (!compra.equals(null)){
            em=1;
        }
        return 0;
    }
}
