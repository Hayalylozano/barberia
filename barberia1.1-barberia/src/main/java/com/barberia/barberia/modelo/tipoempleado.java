
package com.barberia.barberia.modelo;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "tipo_empleado")
public class tipoempleado {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int tip_em_id;
    private String tip_emp_nombre;
    private String tip_emp_observacion;
    
    public tipoempleado(){
        
    }

    public tipoempleado(int tip_em_id, String tip_emp_nombre, String tip_emp_observacion) {
        super();
        this.tip_em_id = tip_em_id;
        this.tip_emp_nombre = tip_emp_nombre;
        this.tip_emp_observacion = tip_emp_observacion;
    }

    public int getTip_em_id() {
        return tip_em_id;
    }

    public void setTip_em_id(int tip_em_id) {
        this.tip_em_id = tip_em_id;
    }

    public String getTip_emp_nombre() {
        return tip_emp_nombre;
    }

    public void setTip_emp_nombre(String tip_emp_nombre) {
        this.tip_emp_nombre = tip_emp_nombre;
    }

    public String getTip_emp_observacion() {
        return tip_emp_observacion;
    }

    public void setTip_emp_observacion(String tip_emp_observacion) {
        this.tip_emp_observacion = tip_emp_observacion;
    }
    
    
}
