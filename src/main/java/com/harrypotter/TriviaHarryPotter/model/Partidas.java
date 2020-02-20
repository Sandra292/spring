package com.harrypotter.TriviaHarryPotter.model;

import javax.persistence.*;
import java.util.Date;


@Entity
public class Partidas {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Column(nullable = false)
    private Date fecha;

    @Column(nullable = false)
    private Integer usuario_id;

    @Column(nullable = false)
    private Integer puntos;


    public Partidas () {

    }



    public Partidas(Integer id, Date fecha, Integer usuario_id, Integer puntos) {
        this.id = id;
        this.fecha = fecha;
        this.usuario_id = usuario_id;
        this.puntos = puntos;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Integer getUsuario_id() {
        return usuario_id;
    }

    public void setUsuario_id(Integer usuario_id) {
        this.usuario_id = usuario_id;
    }

    public Integer getPuntos() {
        return puntos;
    }

    public void setPuntos(Integer puntos) {
        this.puntos = puntos;
    }
}