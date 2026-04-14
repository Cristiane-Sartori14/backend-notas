package com.ProjetoAngular.demo.repository;

import com.ProjetoAngular.demo.model.Nota;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NotaRepository extends JpaRepository<Nota, Long> {
}