package com.barberia.barberia.interfaces;

import com.barberia.barberia.modelo.tipoempleado;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Itipoempleado extends CrudRepository<tipoempleado, Integer> {
}
