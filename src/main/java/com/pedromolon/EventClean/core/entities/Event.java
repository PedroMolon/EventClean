package com.pedromolon.EventClean.core.entities;

import com.pedromolon.EventClean.core.enums.TipoEvento;

import java.time.LocalDateTime;

public record Event(
    Long id,
    String nome,
    String descricao,
    String identificador,
    LocalDateTime dataInicio,
    LocalDateTime dataFim,
    Integer capacidade,
    String localEvento,
    String organizador,
    TipoEvento tipoEvento
) {}
