package com.san.todolist.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.san.todolist.entity.ListaTarefa;

@Repository
public interface ListaTarefaRepository extends JpaRepository<ListaTarefa, Long> {

}
