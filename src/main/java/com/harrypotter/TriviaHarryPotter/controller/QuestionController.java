package com.harrypotter.TriviaHarryPotter.controller;


import com.harrypotter.TriviaHarryPotter.model.Answer;
import com.harrypotter.TriviaHarryPotter.model.Question;
import com.harrypotter.TriviaHarryPotter.service.AnswerService;
import com.harrypotter.TriviaHarryPotter.service.QuestionService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;


import java.util.List;

@Controller

public class QuestionController {


    private QuestionService questionService;
    private AnswerService answerService;

    public QuestionController(QuestionService questionService, AnswerService answerService)
    {
        this.questionService = questionService;
        this.answerService = answerService;
    }

    @GetMapping("partida")
    public String iniciarPartida(Model model)
    {
        try {
            List<Question> listaPreguntas = this.questionService.findAll();
            model.addAttribute("questions", listaPreguntas);
            return "Home/partida";
        } catch (Exception e) {
            return "not-found";
        }
    }



/*
     @PostMapping("partida")
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

            return "Home/partida-respuesta";
        } catch (Exception e) {
            return "not-found";
        }
    }

*/
    @GetMapping("partida/{id}")
    public String getQuestion(@PathVariable(value = "id") Integer id, Model model)
    {
        try {
            Question question = this.questionService.findById(id);
            model.addAttribute("question", question);
            return "partida";
        } catch (Exception e) {
            return "not-found";
        }
    }

    @PostMapping("partida/{id}")
    public String answerQuestion(@PathVariable(value = "id") Integer id, @ModelAttribute("answer") Integer answer_id, Model model)
    {
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
    }

}
