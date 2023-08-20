package com.barberia.barberia.interfacesServicios;

import com.barberia.barberia.modelo.compra;

import java.util.List;
import java.util.Optional;

public interface IServicesCompra {
    public List<compra> listarcompra();

    public Optional<compra> listarIdCo(int idC);
    public int save(compra comp);

}
