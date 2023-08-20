package com.barberia.barberia.modelo;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "compra")
public class compra {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int com_id;
    private int pro_id;
    private int prov_id;
    private float comp_precio_total;
    private Date comp_fecha_com;
    private int comp_cantidad;
    private Date com_fecha_com;

    public compra(){

    }

    public compra(int com_id, int pro_id, int prov_id, float comp_precio_total, Date comp_fecha_com, int comp_cantidad, Date com_fecha_com) {
        super();
        this.com_id = com_id;
        this.pro_id = pro_id;
        this.prov_id = prov_id;
        this.comp_precio_total = comp_precio_total;
        this.comp_fecha_com = comp_fecha_com;
        this.comp_cantidad = comp_cantidad;
        this.com_fecha_com = com_fecha_com;
    }

    public int getCom_id() {
        return com_id;
    }

    public void setCom_id(int com_id) {
        this.com_id = com_id;
    }

    public int getPro_id() {
        return pro_id;
    }

    public void setPro_id(int pro_id) {
        this.pro_id = pro_id;
    }

    public int getProv_id() {
        return prov_id;
    }

    public void setProv_id(int prov_id) {
        this.prov_id = prov_id;
    }

    public float getComp_precio_total() {
        return comp_precio_total;
    }

    public void setComp_precio_total(float comp_precio_total) {
        this.comp_precio_total = comp_precio_total;
    }

    public Date getComp_fecha_com() {
        return comp_fecha_com;
    }

    public void setComp_fecha_com(Date comp_fecha_com) {
        this.comp_fecha_com = comp_fecha_com;
    }

    public int getComp_cantidad() {
        return comp_cantidad;
    }

    public void setComp_cantidad(int comp_cantidad) {
        this.comp_cantidad = comp_cantidad;
    }

    public Date getCom_fecha_com() {
        return com_fecha_com;
    }

    public void setCom_fecha_com(Date com_fecha_com) {
        this.com_fecha_com = com_fecha_com;
    }
}
