package com.harrypotter.TriviaHarryPotter.model;

import javax.persistence.*;
import java.util.Date;


@Entity
public class Temas {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Column(nullable = false)
    private String clasificacion;


    public Temas() {

    }

    public Temas(Integer id, String clasificacion) {
        this.id = id;
        this.clasificacion = clasificacion;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getClasificacion() {
        return clasificacion;
    }

    public void setClasificacion(String clasificacion) {
        this.clasificacion = clasificacion;
    }
}
