package com.barberia.barberia.interfacesServicios;

import java.util.List;
import java.util.Optional;

import  com.barberia.barberia.modelo.cortes;

public interface IServicesCortes {
    public List<cortes>listar();
    public Optional<cortes>litarId(int id);
    public  int save (cortes p);

}
