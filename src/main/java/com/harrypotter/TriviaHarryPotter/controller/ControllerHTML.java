package com.harrypotter.TriviaHarryPotter.controller;

import com.harrypotter.TriviaHarryPotter.model.Usuario;
import com.harrypotter.TriviaHarryPotter.repository.UsuarioJpaRepository;
import com.harrypotter.TriviaHarryPotter.service.Servicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@Controller
public class ControllerHTML {


    @GetMapping("home")
    public String irAlHome() {
        return "Home/home";

    }

    /*@GetMapping("registro")
    public String irAlRegistro() {
        return "Home/registro";

    }*/




   @GetMapping("login")
    public String irAlLogin() {
        return "Home/login";

    }

   /* @PostMapping("login")
    public String usuarioRegistrado() {
        return "Home/login";

    }*/

    @GetMapping("FAQ")
    public String irAFaq() {
        return "Home/faq";

    }

    @GetMapping ("game")
    public String iniciarGame() {
        return "Home/game";

    }

    @PostMapping("game")
    public String irAGame() {
        return "Home/game";

    }

    @GetMapping("partida")
    public String irAPartida() {
        return "Home/partida";
    }


}
