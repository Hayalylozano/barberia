package com.barberia.barberia.interfacesServicios;

import com.barberia.barberia.modelo.empleado;

import java.util.List;
import java.util.Optional;

public interface IServicesEmpleado {
    public List<empleado>listar();
    public Optional<empleado>listarId(int id);
    public  int save (empleado emp);
}
