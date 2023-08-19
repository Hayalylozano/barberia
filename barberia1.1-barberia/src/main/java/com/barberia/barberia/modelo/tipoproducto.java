
package com.barberia.barberia.modelo;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "tipo_producto")
public class tipoproducto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int tip_id;
    private String tip_nombre;
    private String tip_observacion;
    
    public tipoproducto(){
        
    }

    public tipoproducto(int tip_id, String tip_nombre, String tip_observacion) {
        super();
        this.tip_id = tip_id;
        this.tip_nombre = tip_nombre;
        this.tip_observacion = tip_observacion;
    }

    public int getTip_id() {
        return tip_id;
    }

    public void setTip_id(int tip_id) {
        this.tip_id = tip_id;
    }

    public String getTip_nombre() {
        return tip_nombre;
    }

    public void setTip_nombre(String tip_nombre) {
        this.tip_nombre = tip_nombre;
    }

    public String getTip_observacion() {
        return tip_observacion;
    }

    public void setTip_observacion(String tip_observacion) {
        this.tip_observacion = tip_observacion;
    }
    
    
}
