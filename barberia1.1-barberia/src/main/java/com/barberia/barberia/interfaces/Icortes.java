package com.barberia.barberia.interfaces;

import com.barberia.barberia.modelo.cortes;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Icortes extends CrudRepository<cortes , Integer>{

}
