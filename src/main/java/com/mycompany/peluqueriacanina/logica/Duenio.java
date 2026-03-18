package com.mycompany.peluqueriacanina.logica;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Duenio implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id_duenio")
    private int id;
    @Column(name = "nombre", length = 30, nullable = false)
    private String nombre;
    @Column(name = "cel_duenio", length = 15, nullable = false)
    private String celDuenio;
    
    public Duenio() {}

    public Duenio(int id, String nombre, String celDuenio) {
        this.id = id;
        this.nombre = nombre;
        this.celDuenio = celDuenio;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCelDuenio() {
        return celDuenio;
    }

    public void setCelDuenio(String celDuenio) {
        this.celDuenio = celDuenio;
    }
    
    
}
