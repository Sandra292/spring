package com.harrypotter.TriviaHarryPotter.model;

import javax.persistence.*;
import java.util.Date;


@Entity
public class Respuestas {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Column(nullable = false)
    private String pregunta_id;


    public Respuestas() {

    }


    public Respuestas(Integer id, String pregunta_id) {
        this.id = id;
        this.pregunta_id = pregunta_id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPregunta_id() {
        return pregunta_id;
    }

    public void setPregunta_id(String pregunta_id) {
        this.pregunta_id = pregunta_id;
    }
}
