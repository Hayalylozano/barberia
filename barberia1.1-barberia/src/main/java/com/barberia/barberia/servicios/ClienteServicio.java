package com.barberia.barberia.servicios;

import com.barberia.barberia.interfaces.Icliente;
import com.barberia.barberia.interfacesServicios.IServicesCliente;
import com.barberia.barberia.modelo.clientes;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ClienteServicio implements IServicesCliente {

    @Autowired
    private Icliente data;

    @Override
    public List<clientes> listarcliente() {

        return (List<clientes>) data.findAll();
    }

    public Optional<clientes> listarid(int idcliente) {

        return data.findById(idcliente);
    }

    @Override
    public int save(clientes p) {
        int vac =0;
        clientes cliente = data.save(p);
        if (!cliente.equals(null)){
            vac=1;
        }
        return 0;
    }
}
