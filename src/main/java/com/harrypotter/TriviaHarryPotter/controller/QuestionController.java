package com.harrypotter.TriviaHarryPotter.controller;


import com.harrypotter.TriviaHarryPotter.model.Answer;
import com.harrypotter.TriviaHarryPotter.model.Partidas;
import com.harrypotter.TriviaHarryPotter.model.Question;
import com.harrypotter.TriviaHarryPotter.model.Usuarios;
import com.harrypotter.TriviaHarryPotter.repository.PartidasJpaRepository;
import com.harrypotter.TriviaHarryPotter.repository.UsuarioJpaRepository;
import com.harrypotter.TriviaHarryPotter.service.AnswerService;
import com.harrypotter.TriviaHarryPotter.service.QuestionService;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;


import javax.validation.constraints.Null;
import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping("partida")
public class QuestionController {


    private QuestionService questionService;
    private AnswerService answerService;
    private UsuarioJpaRepository usuarioJpaRepository;
    private PartidasJpaRepository partidasJpaRepository;

    public QuestionController(QuestionService questionService, AnswerService answerService,
                              UsuarioJpaRepository usuarioJpaRepository, PartidasJpaRepository partidasJpaRepository) {
        this.questionService = questionService;
        this.answerService = answerService;
        this.usuarioJpaRepository = usuarioJpaRepository;
        this.partidasJpaRepository = partidasJpaRepository;
    }

    @PostMapping("")
    public String iniciarPartida(Model model, Integer position, @Nullable Boolean answer, @Nullable Question question) {
        Optional<Usuarios> opt = this.usuarioJpaRepository.findById(1);
        Usuarios usuario = opt.get();
        try {

            if (usuario.getPartida() == null) {
                Partidas partidaNueva = new Partidas();
                usuario.setPartida(partidaNueva);
                partidaNueva.setUsuario(usuario);
                this.usuarioJpaRepository.save(usuario);
            }

            Partidas partida = usuario.getPartida();

            if (answer == null) {
                partida.setPuntos(0);
                partidasJpaRepository.save(partida);
            }

            if (answer != null && answer.equals(true)) {
                partida.setPuntos(partida.getPuntos()+1);
                this.partidasJpaRepository.save(partida);
            }

            List<Question> listaPreguntas = this.questionService.findAll();
            model.addAttribute("questions", listaPreguntas);

            if (listaPreguntas.size() > position + 1) {
                model.addAttribute("position", position);
                model.addAttribute("question", listaPreguntas.get(position));

                return "Home/partida2";
            } else {


                return "Home/resultado-final";
            }

        } catch (Exception e) {
            return "not-found";
        }
    }



         @GetMapping("resultado-final")
        public String obtenerRespuestas(Integer[] answers, Model model)
        {
            try {
                List<Question> questionList = this.questionService.findAll();
                 Answer answer = this.answerService.findById(answers);
                for (Integer respuesta : answers) {
                    System.out.println(respuesta);
                }
                model.addAttribute("respuestas",answers);

                Boolean correct = this.questionService.isCorrectAnswer((Question) questionList, answer);

                model.addAttribute("question", (Question) questionList);
                model.addAttribute("answer", answer);
                model.addAttribute("correct", correct);

                return "Home/resultado-final";
            } catch (Exception e) {
                return "not-found";
            }
        }


    /*@GetMapping("partida/{id}")
    public String getQuestion(@PathVariable(value = "id") Integer id, Model model) {
        try {
            Question question = this.questionService.findById(id);
            model.addAttribute("question", question);
            return "partida";
        } catch (Exception e) {
            return "not-found";
        }
    }

    @PostMapping("partida/{id}")
    public String answerQuestion(@PathVariable(value = "id") Integer id, @ModelAttribute("answer") Integer answer_id, Model model) {
        try {
            Question question = this.questionService.findById(id);
            Answer answer = this.answerService.findById(answer_id);

            Boolean correct = this.questionService.isCorrectAnswer(question, answer);

            model.addAttribute("question", question);
            model.addAttribute("answer", answer);
            model.addAttribute("correct", correct);

            return "partida-respuesta";
        } catch (Exception e) {
            return "not-found";
        }
    }*/

}
