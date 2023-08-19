package com.barberia.barberia.servicios;

import com.barberia.barberia.interfaces.Iregistro;
import com.barberia.barberia.interfacesServicios.IServicesRegistro;
import com.barberia.barberia.modelo.registro;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class RegistroServicio implements IServicesRegistro {
    @Autowired
    private Iregistro data;

    @Override
    public List<registro> listarregistro(){
        return (List<registro>) data.findAll();
    }

    @Override
    public Optional<registro>listarIdR(int idR){
        return data.findById(idR);
    }

    @Override
    public int save(registro reg) {
        int res =0;
        registro registro = data.save(reg);
        if (!registro.equals(null)){
            res=1;
        }
        return 0;
    }

}
