package com.barberia.barberia.servicios;

import com.barberia.barberia.interfaces.Ifactura;
import com.barberia.barberia.interfaces.Iproducto;
import com.barberia.barberia.interfacesServicios.IServicesFactura;
import com.barberia.barberia.modelo.factura;
import com.barberia.barberia.modelo.producto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class FacturaServicio implements IServicesFactura {
    @Autowired
    private Ifactura data;

    @Override
    public List<factura> listarfactura() { return (List<factura>) data.findAll();}

    @Override
    public Optional<factura> listarIdF(int idFa) {return data.findById(idFa);}

    @Override
    public int save(factura fact){
        int res = 0;
        factura factura = data.save(fact);
        if(!factura.equals(null)){
            res = 1;
        }
        return 0;
    }

}
