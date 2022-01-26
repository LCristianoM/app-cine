package com.sistematrailers.sistematrailers.modelo;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Genero {

    @Id
    @Column(name = "id_genero")
    @Getter @Setter
    private Integer id;

    @Getter @Setter
    private String titulo;

    public Genero(Integer id, String titulo) {
        this.id = id;
        this.titulo = titulo;
    }

    public Genero() {
    }

    public Genero(Integer id) {
        this.id = id;
    }

    public Genero(String titulo) {
        this.titulo = titulo;
    }
}

