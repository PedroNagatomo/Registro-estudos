package com.estudos.registro_estudos.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.estudos.registro_estudos.model.Estudo;

public interface EstudoRepository extends JpaRepository<Estudo, Long> {

}
