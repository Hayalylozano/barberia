package com.barberia.barberia.interfacesServicios;


import java.util.List;
import java.util.Optional;
import com.barberia.barberia.modelo.tipoproducto;


public interface IServicetipoProducto {

    public List<tipoproducto>listartipoprod();
    public Optional<tipoproducto>listarIdT(int id);
    public int savetipoproducto(tipoproducto tp);
}
