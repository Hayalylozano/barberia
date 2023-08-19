package com.barberia.barberia.interfacesServicios;

import com.barberia.barberia.modelo.tipoempleado;

import java.util.List;
import java.util.Optional;

public interface IServicestipoEmpleado {
    public List<tipoempleado>listar();
    public Optional<tipoempleado>listartipemple(int id);
    public int save (tipoempleado tem);
}
