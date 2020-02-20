package com.harrypotter.TriviaHarryPotter.model;

import javax.persistence.*;


@Entity
public class Preguntas {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Column(nullable = false)
    private String respuesta_id;

    @Column(nullable = false)
    private String opcionCorrecta;


    public Preguntas (){

    }

    public Preguntas(Integer id, String respuesta_id, String opcionCorrecta) {
        this.id = id;
        this.respuesta_id = respuesta_id;
        this.opcionCorrecta = opcionCorrecta;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getRespuesta_id() {
        return respuesta_id;
    }

    public void setRespuesta_id(String respuesta_id) {
        this.respuesta_id = respuesta_id;
    }

    public String getOpcionCorrecta() {
        return opcionCorrecta;
    }

    public void setOpcionCorrecta(String opcionCorrecta) {
        this.opcionCorrecta = opcionCorrecta;
    }
}
