package com.barberia.barberia.interfacesServicios;

import com.barberia.barberia.modelo.servicio;

import java.util.List;
import java.util.Optional;

public interface IServicesServicio {

    public List<servicio> listarservicio();
    public Optional<servicio> listaridS(int idS);

    public int save(servicio  ser);
}
