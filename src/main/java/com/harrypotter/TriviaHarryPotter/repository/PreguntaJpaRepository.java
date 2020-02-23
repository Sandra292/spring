package com.harrypotter.TriviaHarryPotter.repository;

import com.harrypotter.TriviaHarryPotter.model.Preguntas;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PreguntaJpaRepository extends JpaRepository<Preguntas, Integer> {
}
