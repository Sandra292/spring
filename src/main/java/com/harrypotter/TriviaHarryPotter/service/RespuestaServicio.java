package com.harrypotter.TriviaHarryPotter.service;

import com.harrypotter.TriviaHarryPotter.apis.RespuestaApi;
import com.harrypotter.TriviaHarryPotter.model.Respuestas;
import com.harrypotter.TriviaHarryPotter.repository.RespuestaJpaRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class RespuestaServicio implements RespuestaApi {


    private RespuestaJpaRepository respuestaJpaRepository;

    public RespuestaServicio(RespuestaJpaRepository respuestaJpaRepository) {
        this.respuestaJpaRepository = respuestaJpaRepository;
    }


    public Respuestas save(Respuestas respuesta)
    {
        return this.respuestaJpaRepository.save(respuesta);
    }

    public Optional<Respuestas> findById(Integer id)
    {
        return this.respuestaJpaRepository.findById(id);
    }

    public List<Respuestas> findAll()
    {

        return this.respuestaJpaRepository.findAll();
    }




}
