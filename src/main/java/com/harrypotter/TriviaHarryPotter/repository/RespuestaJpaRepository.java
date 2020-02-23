package com.harrypotter.TriviaHarryPotter.repository;


import com.harrypotter.TriviaHarryPotter.model.Respuestas;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RespuestaJpaRepository extends JpaRepository<Respuestas, Integer> {
}
