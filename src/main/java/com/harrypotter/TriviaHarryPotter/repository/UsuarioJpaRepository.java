package com.harrypotter.TriviaHarryPotter.repository;

import com.harrypotter.TriviaHarryPotter.model.Usuarios;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioJpaRepository  extends JpaRepository<Usuarios, Integer>{



    Usuarios findByEmail(String mailIngresado);


}
