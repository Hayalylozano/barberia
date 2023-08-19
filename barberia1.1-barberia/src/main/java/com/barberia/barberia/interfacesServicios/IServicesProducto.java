package com.barberia.barberia.interfacesServicios;

import com.barberia.barberia.modelo.producto;
import com.barberia.barberia.modelo.proveedor;

import java.util.List;
import java.util.Optional;

public interface IServicesProducto {
    public List<producto>listarProducto();
    public Optional<producto>listarIdP(int idpd) ;
    public int save(producto prod);

}
