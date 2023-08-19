
package com.barberia.barberia.modelo;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "clientes")
public class clientes {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int cli_id;
    private int cli_documento;
    private String cli_nombre;
    private String cli_apellido;
    private String cli_telefono;
    private String cli_direccion;
    
    public clientes(){

    }

    public clientes(int cli_id,int cli_documento, String cli_nombre, String cli_apellido, String cli_telefono, String cli_direccion) {
        super();
        this.cli_id=cli_id;
        this.cli_documento = cli_documento;
        this.cli_nombre = cli_nombre;
        this.cli_apellido = cli_apellido;
        this.cli_telefono = cli_telefono;
        this.cli_direccion = cli_direccion;
    }

    public int getCli_id() {
        return cli_id;
    }

    public void setCli_id(int cli_id) {
        this.cli_id = cli_id;
    }
    public int getCli_documento() {
        return cli_documento;
    }

    public void setCli_documento(int cli_documento) {
        this.cli_documento = cli_documento;
    }

    public String getCli_nombre() {
        return cli_nombre;
    }

    public void setCli_nombre(String cli_nombre) {
        this.cli_nombre = cli_nombre;
    }

    public String getCli_apellido() {
        return cli_apellido;
    }

    public void setCli_apellido(String cli_apellido) {
        this.cli_apellido = cli_apellido;
    }

    public String getCli_telefono() {
        return cli_telefono;
    }

    public void setCli_telefono(String cli_telefono) {
        this.cli_telefono = cli_telefono;
    }

    public String getCli_direccion() {
        return cli_direccion;
    }

    public void setCli_direccion(String cli_direccion) {
        this.cli_direccion = cli_direccion;
    }

}
