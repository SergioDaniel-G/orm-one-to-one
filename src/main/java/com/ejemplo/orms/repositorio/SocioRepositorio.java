package com.ejemplo.orms.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ejemplo.orms.entity.Socio;

@Repository
public interface SocioRepositorio extends JpaRepository<Socio, Long> {

}
