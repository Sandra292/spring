package com.harrypotter.TriviaHarryPotter.repository;

import com.harrypotter.TriviaHarryPotter.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RestController;

@RestController
public interface UsuarioJpaRepository  extends JpaRepository<Usuario, Integer>{


}
