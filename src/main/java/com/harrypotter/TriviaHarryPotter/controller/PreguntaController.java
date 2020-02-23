package com.harrypotter.TriviaHarryPotter.controller;

import com.harrypotter.TriviaHarryPotter.model.Preguntas;
import com.harrypotter.TriviaHarryPotter.repository.PreguntaJpaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping("bdpregunta")
public class PreguntaController {

    @Autowired
    private PreguntaJpaRepository preguntaJpaRepository;


    @GetMapping("")
    public String irAbaseDeDatos() {
        return "Home/bdpregunta";
    }

    @PostMapping("")
    public String enviarPregunta (Preguntas unaPregunta) {
        preguntaJpaRepository.save(unaPregunta);
                return "Home/bdpregunta";
    }



    @GetMapping ("all")
    public String agregarPregunta (Model model) {
        Preguntas preguntasList = preguntaJpaRepository.getOne(17);
        model.addAttribute("listaPreguntas", preguntasList);
        return "Home/partida";
    }


}
