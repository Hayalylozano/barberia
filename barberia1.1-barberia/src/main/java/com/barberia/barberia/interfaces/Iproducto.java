package com.barberia.barberia.interfaces;

import com.barberia.barberia.modelo.producto;
import org.springframework.data.repository.CrudRepository;

public interface Iproducto extends CrudRepository<producto,Integer> {
}
