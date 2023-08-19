package com.barberia.barberia.servicios;

import com.barberia.barberia.interfaces.Iproveedor;
import com.barberia.barberia.interfacesServicios.IServicioProveedor;
import com.barberia.barberia.modelo.proveedor;
import com.barberia.barberia.modelo.registro;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProveedorServicio implements IServicioProveedor {
    @Autowired
    private Iproveedor data;

    @Override
    public List<proveedor> listar() {
        return (List<proveedor>) data.findAll();
    }

    @Override
    public Optional<proveedor> listarid(int idP) {
        return data.findById(idP);
    }


    @Override
    public int save(proveedor pro) {
        int res =0;
        proveedor proveedor=data.save(pro);
        if (!proveedor.equals(null)){
            res=1;
        }
        return 0;
    }
}
