package com.harrypotter.TriviaHarryPotter.repository;

import com.harrypotter.TriviaHarryPotter.model.Partidas;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PartidasJpaRepository extends JpaRepository<Partidas, Integer> {
}
