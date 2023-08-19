package com.barberia.barberia.servicios;

import com.barberia.barberia.interfaces.Itipoproducto;
import com.barberia.barberia.interfacesServicios.IServicetipoProducto;
import com.barberia.barberia.modelo.tipoproducto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.PreparedStatement;
import java.util.List;
import java.util.Optional;

@Service
public class TipoProductoService implements IServicetipoProducto {

    @Autowired
    private Itipoproducto data;

    @Override
    public List<tipoproducto> listartipoprod() {
        return (List<tipoproducto>) data.findAll();
    }

    @Override
    public Optional<tipoproducto> listarIdT(int id) {
        return data.findById(id);
    }

    @Override
    public int savetipoproducto(tipoproducto tp) {
        int tipro =0;
        tipoproducto tipoproducto = data.save(tp);
        if (!tipoproducto.equals(null)){
            tipro =1;
        }
        return 0;
    }
}
