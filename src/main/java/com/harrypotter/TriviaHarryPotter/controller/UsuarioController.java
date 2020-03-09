package com.harrypotter.TriviaHarryPotter.controller;

import com.harrypotter.TriviaHarryPotter.model.Usuarios;
import com.harrypotter.TriviaHarryPotter.repository.UsuarioJpaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@Controller
public class UsuarioController {

    @Autowired
    private UsuarioJpaRepository usuarioJpaRepository;



    @GetMapping("registro")
    public String irAlRegistro(Usuarios usuarios) {
        return "Home/registro";

    }


    @PostMapping("registro")
    public String validarRegistro(@Valid Usuarios usuarios, BindingResult bindingResult) {

        if (bindingResult.hasErrors()) {
            return "Home/registro";
        }

        usuarioJpaRepository.save(usuarios);
        return "Home/login";
    }


  /*  @GetMapping("login")
    public String login(Model model, String error, String logout) {
        if (error != null)
            model.addAttribute("error", "Usuario o password incorrectos");
        return "Home/login";
    }*/

    @GetMapping("login")
    public String irAlLogin() {
        return "Home/login";

    }

    @PostMapping("login")
    public String comprobarLogin(Model model, Usuarios usuario) {
        String mailIngresado = usuario.getEmail();
        String contraseñaIngresada = usuario.getContraseña();

        Usuarios usuarioEncontrado = usuarioJpaRepository.findByEmail(mailIngresado);

        if(usuarioEncontrado == null) {
            return "Home/error";
        }

        if(usuarioEncontrado.getContraseña().equals(contraseñaIngresada)) {
            model.addAttribute("usuario", usuarioEncontrado.getUsuario());
            return "Home/game";
        } else {
            return "Home/error";
        }

    }






}


