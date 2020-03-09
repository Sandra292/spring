package com.harrypotter.TriviaHarryPotter.model;

import javax.persistence.*;
import java.util.Date;


@Entity
public class Partidas {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @OneToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name="usuario_id")
    private Usuarios usuario;

    @Column
    private Integer puntos;


    public Partidas () {
        this.puntos = 0;

    }



    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Usuarios getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuarios usuario) {
        this.usuario = usuario;
    }

    public Integer getPuntos() {
        return puntos;
    }

    public void setPuntos(Integer puntos) {
        this.puntos = puntos;
    }
}