package com.barberia.barberia.modelo;

import jakarta.persistence.*;

import java.sql.Date;
import java.sql.Time;

@Entity
@Table(name = "servicio")
public class servicio {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int ser_id;
    private int cli_id;
    private int cort_id;
    private int emp_id;
    private String ser_inicio_hora;
    private String ser_final_hora;
    private String ser_observacion;
    private int ser_cancela;

    public servicio(){

    }

    public servicio(int ser_id, int cli_id, int cort_id, int emp_id, String ser_inicio_hora, String ser_final_hora, String ser_observacion, int ser_cancela) {
        super();
        this.ser_id = ser_id;
        this.cli_id = cli_id;
        this.cort_id = cort_id;
        this.emp_id = emp_id;
        this.ser_inicio_hora = ser_inicio_hora;
        this.ser_final_hora = ser_final_hora;
        this.ser_observacion = ser_observacion;
        this.ser_cancela = ser_cancela;
    }

    public int getSer_id() {
        return ser_id;
    }

    public void setSer_id(int ser_id) {
        this.ser_id = ser_id;
    }

    public int getCli_id() {
        return cli_id;
    }

    public void setCli_id(int cli_id) {
        this.cli_id = cli_id;
    }

    public int getCort_id() {
        return cort_id;
    }

    public void setCort_id(int cort_id) {
        this.cort_id = cort_id;
    }

    public int getEmp_id() {
        return emp_id;
    }

    public void setEmp_id(int emp_id) {
        this.emp_id = emp_id;
    }

    public String getSer_inicio_hora() {
        return ser_inicio_hora;
    }

    public void setSer_inicio_hora(String ser_inicio_hora) {
        this.ser_inicio_hora = ser_inicio_hora;
    }

    public String getSer_final_hora() {
        return ser_final_hora;
    }

    public void setSer_final_hora(String ser_final_hora) {
        this.ser_final_hora = ser_final_hora;
    }

    public String getSer_observacion() {
        return ser_observacion;
    }

    public void setSer_observacion(String ser_observacion) {
        this.ser_observacion = ser_observacion;
    }

    public int getSer_cancela() {
        return ser_cancela;
    }

    public void setSer_cancela(int ser_cancela) {
        this.ser_cancela = ser_cancela;
    }
}
