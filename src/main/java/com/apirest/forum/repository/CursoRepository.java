package com.apirest.forum.repository;

import com.apirest.forum.model.Curso;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CursoRepository  extends JpaRepository<Curso, Long>{

	Curso findByNome(String nome);

}
