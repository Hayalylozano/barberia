package com.barberia.barberia.servicios;

import com.barberia.barberia.interfaces.Iservicio;
import com.barberia.barberia.interfacesServicios.IServicesServicio;
import com.barberia.barberia.modelo.servicio;
import com.barberia.barberia.modelo.tipoempleado;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ServicioServicio implements IServicesServicio {
    @Autowired
    private Iservicio data;

    @Override
    public List<servicio> listarservicio() {
        return (List<servicio>) data.findAll();
    }

    @Override
    public Optional<servicio> listaridS(int idS) {
        return data.findById(idS);
    }

    @Override
    public int save(servicio  ser) {
        int res =0;
        servicio servicio =data.save(ser);
        if (!servicio.equals(null)){
            res=1;
        }
        return 0;
    }
}
