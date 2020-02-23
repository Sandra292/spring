package com.harrypotter.TriviaHarryPotter.controller;

import com.harrypotter.TriviaHarryPotter.model.Usuario;
import com.harrypotter.TriviaHarryPotter.repository.UsuarioJpaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping("registro")
public class UsuarioController {

    @Autowired
    private UsuarioJpaRepository usuarioJpaRepository;

    /*@GetMapping("")
    public List<Usuario> getUsuarios(){
        List<Usuario> usuarios = usuarioJpaRepository.findAll();
        return usuarios;
    }*/

    @GetMapping("")
    public String irAlRegistro() {
        return "Home/registro";

    }


    /*@GetMapping("{id}")
    public Usuario getUsuarioById(@PathVariable("id") Integer id) {
        Optional<Usuario> unOptionalUsuario = usuarioJpaRepository.findById(id);
        return unOptionalUsuario.get();
    }*/


    /*@PostMapping("")
    public Usuario insertUsuario(@RequestBody Usuario unUsuarioARegistrar) {
        Usuario unUsuarioRegistrado =  usuarioJpaRepository.save(unUsuarioARegistrar);
        return unUsuarioRegistrado;
    }*/

    /*@DeleteMapping("{id}")
    public void deleteUsuario(@PathVariable("id") Integer id) {
        usuarioJpaRepository.deleteById(id);
    }*/


    @PostMapping("")
    public String agregarUsuario (Usuario usuarioRegistrado) {
         usuarioJpaRepository.save(usuarioRegistrado);
        return "Home/login";
    }





}


