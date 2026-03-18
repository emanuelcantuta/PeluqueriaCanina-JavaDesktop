package com.mycompany.peluqueriacanina.logica;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "mascotas")
public class Mascota implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "num_cliente")
    private int numCliente;
    
    @Column(name = "nombre", length = 30, nullable = false)
    private String nombre;
    
    @Column(name = "raza", length = 30, nullable = false)
    private String raza;
    
    @Column(name = "color", length = 30)
    private String color;
    
    @Enumerated(EnumType.STRING)
    @Column(name = "alergico", length = 5, nullable = false)
    private EstadoOpcional alergico;
    
    @Enumerated(EnumType.STRING)
    @Column(name = "atencion_especial", length = 5, nullable = false)
    private EstadoOpcional atencionEspecial;
    
    @Lob
    @Column(name = "observaciones")
    private String observaciones;
    
    @OneToOne
    private Duenio duenio;

    public Mascota() {}

    public Mascota(int numCliente, String nombre, String raza, String color, EstadoOpcional alergico, EstadoOpcional atencionEspecial, String observaciones, Duenio duenio) {
        this.numCliente = numCliente;
        this.nombre = nombre;
        this.raza = raza;
        this.color = color;
        this.alergico = alergico;
        this.atencionEspecial = atencionEspecial;
        this.observaciones = observaciones;
        this.duenio = duenio;
    }

    public int getNumCliente() {
        return numCliente;
    }

    public void setNumCliente(int numCliente) {
        this.numCliente = numCliente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public EstadoOpcional getAlergico() {
        return alergico;
    }

    public void setAlergico(EstadoOpcional alergico) {
        this.alergico = alergico;
    }

    public EstadoOpcional getAtencionEspecial() {
        return atencionEspecial;
    }

    public void setAtencionEspecial(EstadoOpcional atencionEspecial) {
        this.atencionEspecial = atencionEspecial;
    }
    
    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    public Duenio getDuenio() {
        return duenio;
    }

    public void setDuenio(Duenio duenio) {
        this.duenio = duenio;
    }
    
}

