package com.barberia.barberia.modelo;

import jakarta.persistence.*;

@Entity
@Table(name ="registro")
public class registro {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int res_id;
    private int id_producto;
    private int emp_id;
    private String res_cambio;
    private String res_novedad;

    public registro(){

    }

    public registro(int res_id, int id_producto, int emp_id, String res_cambio, String res_novedad) {
        super();
        this.res_id = res_id;
        this.id_producto = id_producto;
        this.emp_id = emp_id;
        this.res_cambio =res_cambio;
        this.res_novedad = res_novedad;
    }

    public int getRes_id() {
        return res_id;
    }

    public void setRes_id(int res_id) {
        this.res_id = res_id;
    }

    public int getId_producto() {
        return id_producto;
    }

    public void setId_producto(int id_producto) {
        this.id_producto = id_producto;
    }

    public int getEmp_id() {
        return emp_id;
    }

    public void setEmp_id(int emp_id) {
        this.emp_id = emp_id;
    }

    public String getRes_cambio() {
        return res_cambio;
    }

    public void setRes_cambio(String res_cambio) {
        this.res_cambio = res_cambio;
    }

    public String getRes_novedad() {
        return res_novedad;
    }

    public void setRes_novedad(String res_novedad) {
        this.res_novedad = res_novedad;
    }
}
