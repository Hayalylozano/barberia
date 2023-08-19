package com.barberia.barberia.interfaces;

import com.barberia.barberia.modelo.tipoproducto;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Itipoproducto extends CrudRepository<tipoproducto,Integer> {
}
