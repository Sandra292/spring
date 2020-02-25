package com.harrypotter.TriviaHarryPotter.controller;

import com.harrypotter.TriviaHarryPotter.model.Preguntas;
import com.harrypotter.TriviaHarryPotter.model.Respuestas;
import com.harrypotter.TriviaHarryPotter.service.PreguntaServicio;
import com.harrypotter.TriviaHarryPotter.service.RespuestaServicio;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
/*@RequestMapping("bdpregunta")*/
public class DatosController {

    private PreguntaServicio preguntaServicio;
    private RespuestaServicio respuestaServicio;

    public DatosController(PreguntaServicio preguntaServicio, RespuestaServicio respuestaServicio) {
        this.preguntaServicio = preguntaServicio;
        this.respuestaServicio = respuestaServicio;
    }

    @GetMapping("bdpregunta")
    public String irAbaseDeDatos() {
        return "Home/bdpregunta";
    }


    @GetMapping("partida")
    public String agregarDatos (Preguntas pregunta, Respuestas respuesta, Model model)
    {
        model.addAttribute("preguntas", this.preguntaServicio.findAll());
        model.addAttribute("respuestas", this.respuestaServicio.findAll());
        return "Home/partida";
    }




    @PostMapping("partida")
    public String enviarDatos (Preguntas unaPregunta, Respuestas unaRespuesta)
    {
        Preguntas newPregunta = this.preguntaServicio.save(unaPregunta);
        Respuestas newRespuesta = this.respuestaServicio.save(unaRespuesta);
        /*return "redirect:all";*/
        return "Home/partida";
    }











    /* @Autowired
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
    }*/


}
