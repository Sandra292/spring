package com.harrypotter.TriviaHarryPotter.service;



import com.harrypotter.TriviaHarryPotter.model.Answer;
import com.harrypotter.TriviaHarryPotter.model.Question;
import com.harrypotter.TriviaHarryPotter.repository.QuestionJpaRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class QuestionService {

    private QuestionJpaRepository questionJPARepository;

    public QuestionService(QuestionJpaRepository questionJPARepository)
    {
        this.questionJPARepository = questionJPARepository;
    }

    public List<Question> findAll()
    {
        return this.questionJPARepository.findAll();
    }

    public Question findById(Integer id) throws Exception
    {
        Optional<Question> question = this.questionJPARepository.findById(id);

        if (question.isPresent()) {
            return question.get();
        }

        throw new Exception("Pregunta no encontrada");
    }

    public Boolean isCorrectAnswer(Question question, Answer answer)
    {
        return  question.getCorrectAnswers()
                .stream()
                .filter(ans -> ans.equals(answer))
                .findAny().isPresent();
    }

}
