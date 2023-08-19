
package com.barberia.barberia.modelo;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "proveedor")
public class proveedor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int prov_id;
    private String prov_documento;
    private String prov_nombre;
    private String prov_apellido;
    private String prov_telefono;
    private String prov_direccion;
    
    public proveedor(){
        
    }

    public proveedor(int prov_id ,String prov_documento, String prov_nombre, String prov_apellido, String prov_telefono, String prov_direccion) {
        super();
        this.prov_id = prov_id;
        this.prov_documento = prov_documento;
        this.prov_nombre = prov_nombre;
        this.prov_apellido = prov_apellido;
        this.prov_telefono = prov_telefono;
        this.prov_direccion = prov_direccion;
    }

    public int getProv_id() {
        return prov_id;
    }

    public void setProv_id(int prov_id) {
        this.prov_id = prov_id;
    }
    public String getProv_documento() {
        return prov_documento;
    }
    public void setProv_documento(String prov_documento) {
        this.prov_documento = prov_documento;
    }
    public String getProv_nombre() {
        return prov_nombre;
    }

    public void setProv_nombre(String prov_nombre) {
        this.prov_nombre = prov_nombre;
    }

    public String getProv_apellido() {
        return prov_apellido;
    }

    public void setProv_apellido(String prov_apellido) {
        this.prov_apellido = prov_apellido;
    }

    public String getProv_telefono() {
        return prov_telefono;
    }

    public void setProv_telefono(String prov_telefono) {
        this.prov_telefono = prov_telefono;
    }

    public String getProv_direccion() {
        return prov_direccion;
    }

    public void setProv_direccion(String prov_direccion) {
        this.prov_direccion = prov_direccion;
    }

}
