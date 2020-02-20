package com.harrypotter.TriviaHarryPotter.controller;

import com.harrypotter.TriviaHarryPotter.model.Usuario;
import com.harrypotter.TriviaHarryPotter.repository.UsuarioJpaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("usuarios")
public class UsuarioRestController {

    @Autowired
    private UsuarioJpaRepository usuarioJpaRepository;

    @GetMapping("")
    public List<Usuario> getUsuarios(){
        List<Usuario> usuarios = usuarioJpaRepository.findAll();
        return usuarios;
    }


    @GetMapping("{id}")
    public Usuario getUsuarioById(@PathVariable("id") Integer id) {
        Optional<Usuario> unOptionalUsuario = usuarioJpaRepository.findById(id);
        return unOptionalUsuario.get();
    }

    @PostMapping("")
    public Usuario insertUsuario(@RequestBody Usuario unUsuarioARegistrar) {
        Usuario unUsuarioRegistrado =  usuarioJpaRepository.save(unUsuarioARegistrar);
        return unUsuarioRegistrado;
    }

    @DeleteMapping("{id}")
    public void deleteUsuario(@PathVariable("id") Integer id) {
        usuarioJpaRepository.deleteById(id);
    }


}


