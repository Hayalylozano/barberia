
package com.barberia.barberia.modelo;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "empleado")
public class empleado {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int emp_id;
    private int emp_documento;
    private int tip_empleado;
    private String emp_nombre;
    private String emp_apellido;
    private String emp_telefono;
    private String emp_direccion;
    
    public empleado(){
        
    }

    public empleado(int emp_id,int emp_documento, int tip_empleado, String emp_nombre, String emp_apellido, String emp_telefono, String emp_direccion) {
        super();
        this.emp_id= emp_id;
        this.emp_documento = emp_documento;
        this.tip_empleado = tip_empleado;
        this.emp_nombre = emp_nombre;
        this.emp_apellido = emp_apellido;
        this.emp_telefono = emp_telefono;
        this.emp_direccion = emp_direccion;
    }
    public int getEmp_id() {return emp_id;}

    public void setEmp_id(int emp_id) {this.emp_id = emp_id;}

    public int getEmp_documento() {
        return emp_documento;
    }

    public void setEmp_documento(int emp_documento) {
        this.emp_documento = emp_documento;
    }

    public int getTip_empleado() {
        return tip_empleado;
    }

    public void setTip_empleado(int tip_empleado) {
        this.tip_empleado = tip_empleado;
    }

    public String getEmp_nombre() {
        return emp_nombre;
    }

    public void setEmp_nombre(String emp_nombre) {
        this.emp_nombre = emp_nombre;
    }

    public String getEmp_apellido() {
        return emp_apellido;
    }

    public void setEmp_apellido(String emp_apellido) {
        this.emp_apellido = emp_apellido;
    }

    public String getEmp_telefono() {
        return emp_telefono;
    }

    public void setEmp_telefono(String emp_telefono) {
        this.emp_telefono = emp_telefono;
    }

    public String getEmp_direccion() {
        return emp_direccion;
    }

    public void setEmp_direccion(String emp_direccion) {
        this.emp_direccion = emp_direccion;
    }

}
