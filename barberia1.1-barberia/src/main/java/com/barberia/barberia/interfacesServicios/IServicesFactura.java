package com.barberia.barberia.interfacesServicios;

import com.barberia.barberia.modelo.factura;
import com.barberia.barberia.modelo.registro;

import java.util.List;
import java.util.Optional;

public interface IServicesFactura {
    public List<factura> listarfactura();
    public Optional<factura> listarIdF(int idFa);
    public int save(factura fact);
}
