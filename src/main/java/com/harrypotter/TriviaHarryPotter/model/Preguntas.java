package com.harrypotter.TriviaHarryPotter.model;

import javax.persistence.*;


@Entity
public class Preguntas {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Column(nullable = false)
    private String pregunta;


    public Preguntas() {

    }

    public Preguntas(Integer id, String pregunta) {
        this.id = id;
        this.pregunta = pregunta;

    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }


    public String getPregunta() {
        return pregunta;
    }

    public void setPregunta(String pregunta) {
        this.pregunta = pregunta;
    }

}


