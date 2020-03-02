package com.harrypotter.TriviaHarryPotter.repository;


import com.harrypotter.TriviaHarryPotter.model.Question;
import org.springframework.data.jpa.repository.JpaRepository;

public interface QuestionJpaRepository extends JpaRepository<Question, Integer> {
}
