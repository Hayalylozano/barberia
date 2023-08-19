package com.barberia.barberia.modelo;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "cortes")
public class cortes {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_corte;
    private String 	cor_nombre;
    private Float cor_precio;

    public cortes(){

    }

    public cortes(int id_corte, String cor_nombre, Float cor_precio) {
        super();
        this.id_corte = id_corte;
        this.cor_nombre = cor_nombre;
        this.cor_precio = cor_precio;
    }


    public int getId_corte() {
        return id_corte;
    }

    public void setId_corte(int id_corte) {
        this.id_corte = id_corte;
    }

    public String getCor_nombre() {
        return cor_nombre;
    }

    public void setCor_nombre(String cor_nombre) {
        this.cor_nombre = cor_nombre;
    }

    public Float getCor_precio() {
        return cor_precio;
    }

    public void setCor_precio(Float cor_precio) {
        this.cor_precio = cor_precio;
    }
}
