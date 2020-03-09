package com.harrypotter.TriviaHarryPotter.model;

import javax.persistence.*;
import javax.validation.constraints.*;

@Entity
public class Usuarios {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Column(nullable = false)
    @NotNull(message = "El nombre es obligatorio.")
    @Size(min=3, max=30, message = "El nombre debe tener al menos 3 caracteres.")
    private String nombre;

    @Column(nullable = false)
    @NotNull(message = "El apellido es obligatorio.")
    @Size(min=5, max=30, message = "El apellido debe tener al menos 5 caracteres.")
    private String apellido;

    @Column(nullable = false, unique = true)
    @NotNull(message = "El usuario es obligatorio.")
    @Size(min=5, message = "El usuario debe tener al menos 5 caracteres.")
    private String usuario;

    @Column(nullable = false, unique = true)
    @NotNull(message = "El email es obligatorio.")
    @Email
    private String email;

    @Column(nullable = false)
    @NotNull(message = "La contraseña es obligatoria.")
    @Size(min=8, message = "La contraseña debe tener al menos 8 caracteres.")
    private String contraseña;

    @Column(nullable = false)
    @NotNull(message = "La contraseña debe coincidir.")
    @Min(8)
    private String confirmarContraseña;

    @Column(nullable = false)
    @NotNull(message = "El país es obligatorio.")

    private String paises;

    @OneToOne(fetch = FetchType.LAZY,
            cascade =  CascadeType.ALL, mappedBy = "usuario")
    private Partidas partida;



    public Usuarios() {

    }

    public Usuarios(Integer id, String nombre, String apellido, String usuario, String email, String contraseña, String confirmarContraseña, String paises) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.usuario = usuario;
        this.email = email;
        this.contraseña = contraseña;
        this.confirmarContraseña = confirmarContraseña;
        this.paises = paises;
    }

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

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public String getConfirmarContraseña() {
        return confirmarContraseña;
    }

    public void setConfirmarContraseña(String confirmarContraseña) {
        this.confirmarContraseña = confirmarContraseña;
    }

    public String getPaises() {
        return paises;
    }

    public void setPaises(String paises) {
        this.paises = paises;
    }

    public Partidas getPartida() {
        return partida;
    }

    public void setPartida(Partidas partida) {
        this.partida = partida;
    }

}

