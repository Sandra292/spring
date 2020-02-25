package com.harrypotter.TriviaHarryPotter.model;

import javax.persistence.*;
import java.util.Date;


@Entity
public class Respuestas {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Column(nullable = false)
    private String respuesta1;

    @Column(nullable = false)
    private String respuesta2;

    @Column(nullable = false)
    private String respuesta3;

    @Column(nullable = false)
    private String respuesta4;


    public Respuestas() {
    }

    public Respuestas(Integer id, String respuesta1, String respuesta2, String respuesta3, String respuesta4) {
        this.id = id;
        this.respuesta1 = respuesta1;
        this.respuesta2 = respuesta2;
        this.respuesta3 = respuesta3;
        this.respuesta4 = respuesta4;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getRespuesta1() {
        return respuesta1;
    }

    public void setRespuesta1(String respuesta1) {
        this.respuesta1 = respuesta1;
    }

    public String getRespuesta2() {
        return respuesta2;
    }

    public void setRespuesta2(String respuesta2) {
        this.respuesta2 = respuesta2;
    }

    public String getRespuesta3() {
        return respuesta3;
    }

    public void setRespuesta3(String respuesta3) {
        this.respuesta3 = respuesta3;
    }

    public String getRespuesta4() {
        return respuesta4;
    }

    public void setRespuesta4(String respuesta4) {
        this.respuesta4 = respuesta4;
    }
}

