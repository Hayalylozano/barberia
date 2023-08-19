package com.barberia.barberia.interfacesServicios;

import com.barberia.barberia.modelo.registro;

import java.util.List;
import java.util.Optional;

public interface IServicesRegistro {
    public List<registro> listarregistro();
    public Optional<registro> listarIdR(int idR);
    public int save(registro reg);
}
