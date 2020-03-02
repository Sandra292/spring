package com.harrypotter.TriviaHarryPotter.service;


import com.harrypotter.TriviaHarryPotter.model.Answer;
import com.harrypotter.TriviaHarryPotter.repository.AnswerJpaRepository;

import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class AnswerService {

    private AnswerJpaRepository answerJPARepository;

    public AnswerService(AnswerJpaRepository answerJPARepository)
    {
        this.answerJPARepository = answerJPARepository;
    }

    public Answer findById(Integer id) throws Exception {
        Optional<Answer> answer = this.answerJPARepository.findById(id);

        if (answer.isPresent()) {
            return answer.get();
        }

        throw new Exception("Respuesta no encontrada");
    }
}
