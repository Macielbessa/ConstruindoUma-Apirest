package com.apirest.forum.repository;

import com.apirest.forum.model.Topico;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TopicoRepository extends JpaRepository<Topico, Long> {

}
