package org.example.entities;

import jakarta.persistence.*;

import java.io.Serializable;

@Entity
@Table(name = "animales")
public class Animal implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String nombre;

    private String especie;

    private Integer edad;

    @Column(name = "descripcion_perdida", length = 500)
    private String descripcionPerdida;

    @Column(name = "estado_refugio", length = 50)
    private String estadoRefugio; // "recién abandonado", "tiempo en refugio", "próximamente en acogida"

    // Constructores
    public Animal() {}

    public Animal(String nombre, String especie, Integer edad, String descripcionPerdida, String estadoRefugio) {
        this.nombre = nombre;
        this.especie = especie;
        this.edad = edad;
        this.descripcionPerdida = descripcionPerdida;
        this.estadoRefugio = estadoRefugio;
    }

    // Getters y Setters
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public String getDescripcionPerdida() {
        return descripcionPerdida;
    }

    public void setDescripcionPerdida(String descripcionPerdida) {
        this.descripcionPerdida = descripcionPerdida;
    }

    public String getEstadoRefugio() {
        return estadoRefugio;
    }

    public void setEstadoRefugio(String estadoRefugio) {
        this.estadoRefugio = estadoRefugio;
    }
}