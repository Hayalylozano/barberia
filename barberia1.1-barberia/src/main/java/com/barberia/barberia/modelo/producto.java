package com.barberia.barberia.modelo;

import jakarta.persistence.*;

@Entity
@Table(name = "producto")
public class producto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int pro_id;
    private int tip_pro_id;
    private String pro_nombre;
    private String pro_codigo;
    private String pro_descripcion;
    private float pro_precio;
    private int  pro_existencia;

    public producto(){

    }

    public producto (int pro_id , int tip_pro_id, String pro_nombre, String pro_codigo, String pro_descripcion, float pro_precio, int pro_existencia) {
        super();
        this.pro_id = pro_id;
        this.tip_pro_id = tip_pro_id;
        this.pro_nombre = pro_nombre;
        this.pro_codigo = pro_codigo;
        this.pro_descripcion = pro_descripcion;
        this.pro_precio = pro_precio;
        this.pro_existencia= pro_existencia;
    }

    public int getPro_id() {
        return pro_id;
    }

    public void setPro_id(int pro_id) {
        this.pro_id = pro_id;
    }

    public int getTip_pro_id() {
        return tip_pro_id;
    }

    public void setTip_pro_id(int tip_pro_id) {
        this.tip_pro_id = tip_pro_id;
    }

    public String getPro_nombre() {
        return pro_nombre;
    }

    public void setPro_nombre(String pro_nombre) {
        this.pro_nombre = pro_nombre;
    }

    public String getPro_codigo() {
        return pro_codigo;
    }

    public void setPro_codigo(String pro_codigo) {
        this.pro_codigo = pro_codigo;
    }

    public String getPro_descripcion() {
        return pro_descripcion;
    }

    public void setPro_descripcion(String pro_descripcion) {
        this.pro_descripcion = pro_descripcion;
    }

    public float getPro_precio() {
        return pro_precio;
    }

    public void setPro_precio(float pro_precio) {
        this.pro_precio = pro_precio;
    }

    public int getPro_existencia() {
        return pro_existencia;
    }

    public void setPro_existencia(int pro_existencia) {
        this.pro_existencia = pro_existencia;
    }
}
