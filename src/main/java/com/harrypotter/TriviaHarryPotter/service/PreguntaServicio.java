package com.harrypotter.TriviaHarryPotter.service;


import com.harrypotter.TriviaHarryPotter.apis.PreguntaApi;
import com.harrypotter.TriviaHarryPotter.model.Preguntas;
import com.harrypotter.TriviaHarryPotter.repository.PreguntaJpaRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PreguntaServicio implements PreguntaApi {

    private PreguntaJpaRepository preguntaJpaRepository;

    public PreguntaServicio(PreguntaJpaRepository preguntaJpaRepository) {
        this.preguntaJpaRepository = preguntaJpaRepository;
    }

    public Preguntas save(Preguntas pregunta)
    {
        return this.preguntaJpaRepository.save(pregunta);
    }

    public Optional<Preguntas> findById(Integer id)
    {
        return this.preguntaJpaRepository.findById(id);
    }

    public List<Preguntas> findAll()
    {

        return this.preguntaJpaRepository.findAll();
    }

}
