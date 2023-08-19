package com.barberia.barberia.interfacesServicios;

import java.util.List;
import java.util.Optional;
import com.barberia.barberia.modelo.clientes;
public interface IServicesCliente {

    public List<clientes>listarcliente();
    public Optional<clientes>listarid(int idcliente);
    public int save (clientes p);
}
