package com.coderio.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.coderio.model.Tarea;

public interface TareaRepository extends JpaRepository<Tarea, Integer>{

}
