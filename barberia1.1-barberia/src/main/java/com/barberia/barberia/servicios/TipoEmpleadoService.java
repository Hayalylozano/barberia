package com.barberia.barberia.servicios;

import com.barberia.barberia.interfaces.Itipoempleado;
import com.barberia.barberia.interfacesServicios.IServicestipoEmpleado;
import com.barberia.barberia.modelo.cortes;
import com.barberia.barberia.modelo.tipoempleado;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TipoEmpleadoService implements IServicestipoEmpleado {
    @Autowired
    private Itipoempleado data;

    @Override
    public List<tipoempleado> listar() {
        return (List<tipoempleado>) data.findAll();
    }

    @Override
    public Optional<tipoempleado> listartipemple(int id) {
        return data.findById(id);
    }

    @Override
    public int save(tipoempleado tem) {
        int res =0;
        tipoempleado tipoempleado=data.save(tem);
        if (!tipoempleado.equals(null)){
            res=1;
        }
        return 0;
    }
}
