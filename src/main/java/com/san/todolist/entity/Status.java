package com.san.todolist.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum Status {
    NAO_INICIADO("Não iniciado"),
    EM_PROGRESSO("Em progresso"),
    FEITO("Feito");

    private final String nome;
}
