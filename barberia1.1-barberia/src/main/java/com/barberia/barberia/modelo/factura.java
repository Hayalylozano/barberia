package com.barberia.barberia.modelo;

import jakarta.persistence.*;
import org.springframework.web.bind.annotation.RequestMapping;

@Entity
@Table(name = "factura")
public class factura {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int fac_id;
    private int ser_id;
    private int pro_id;
    private int fac_cantidad;
    private float fac_precio_total;
    private float fac_descuento;

    public factura(){

    }

    public factura(int fac_id, int ser_id, int pro_id, int fac_cantidad, float fac_precio_total, float fac_descuento) {
        super();
        this.fac_id = fac_id;
        this.ser_id = ser_id;
        this.pro_id = pro_id;
        this.fac_cantidad = fac_cantidad;
        this.fac_precio_total = fac_precio_total;
        this.fac_descuento = fac_descuento;
    }

    public int getFac_id() {
        return fac_id;
    }

    public void setFac_id(int fac_id) {
        this.fac_id = fac_id;
    }

    public int getSer_id() {
        return ser_id;
    }

    public void setSer_id(int ser_id) {
        this.ser_id = ser_id;
    }

    public int getPro_id() {
        return pro_id;
    }

    public void setPro_id(int pro_id) {
        this.pro_id = pro_id;
    }

    public int getFac_cantidad() {
        return fac_cantidad;
    }

    public void setFac_cantidad(int fac_cantidad) {
        this.fac_cantidad = fac_cantidad;
    }

    public float getFac_precio_total() {
        return fac_precio_total;
    }

    public void setFac_precio_total(float fac_precio_total) {
        this.fac_precio_total = fac_precio_total;
    }

    public float getFac_descuento() {
        return fac_descuento;
    }

    public void setFac_descuento(float fac_descuento) {
        this.fac_descuento = fac_descuento;
    }
}
