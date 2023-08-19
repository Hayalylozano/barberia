package com.barberia.barberia.interfaces;

import org.springframework.data.repository.CrudRepository;
import com.barberia.barberia.modelo.clientes;
import org.springframework.stereotype.Repository;

@Repository
public interface Icliente extends CrudRepository<clientes, Integer> {
}
