package com.barberia.barberia.servicios;

import com.barberia.barberia.interfaces.Icortes;
import com.barberia.barberia.interfacesServicios.IServicesCortes;
import com.barberia.barberia.modelo.cortes;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CorteServicio implements IServicesCortes {

    @Autowired
    private  Icortes data;


    @Override
    public List<cortes> listar() {

        return (List<cortes>) data.findAll();
    }

    @Override
    public Optional<cortes> litarId(int id) {
        return data.findById(id);
    }

    @Override
    public int save(cortes p) {
        int res =0;
        cortes cortes=data.save(p);
        if (!cortes.equals(null)){
            res=1;
        }
        return 0;
    }
}
