package com.barberia.barberia.interfaces;

import com.barberia.barberia.modelo.factura;
import org.springframework.data.repository.CrudRepository;

public interface Ifactura extends CrudRepository<factura,Integer> {
}
