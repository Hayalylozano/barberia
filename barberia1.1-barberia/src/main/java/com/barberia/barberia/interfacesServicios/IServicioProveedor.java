package com.barberia.barberia.interfacesServicios;

import com.barberia.barberia.modelo.proveedor;
import com.barberia.barberia.modelo.registro;

import java.util.List;
import java.util.Optional;

public interface IServicioProveedor {
    public List<proveedor>listar();
    public Optional<proveedor>listarid(int idP);
    public int save(proveedor pro);
}
