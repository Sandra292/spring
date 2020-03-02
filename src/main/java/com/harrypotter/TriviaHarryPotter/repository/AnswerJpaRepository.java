package com.harrypotter.TriviaHarryPotter.repository;


import com.harrypotter.TriviaHarryPotter.model.Answer;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface AnswerJpaRepository extends JpaRepository<Answer, Integer> {
    Optional<Answer> findById(Integer[] id);
}
