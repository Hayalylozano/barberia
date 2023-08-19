package com.barberia.barberia.servicios;

import com.barberia.barberia.interfaces.Iempleado;
import com.barberia.barberia.interfacesServicios.IServicesEmpleado;
import com.barberia.barberia.interfacesServicios.IServicestipoEmpleado;
import com.barberia.barberia.modelo.empleado;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmpleadoService implements IServicesEmpleado {

    @Autowired
    private Iempleado data;

    @Override
    public List<empleado> listar() {
        return (List<empleado>) data.findAll();
    }

    @Override
    public Optional<empleado> listarId(int id) {
        return data.findById(id);
    }

    @Override
    public int save(empleado emp) {
        int em =0;
        empleado empleado=data.save(emp);
        if (!empleado.equals(null)){
            em=1;
        }
        return 0;
    }


}
