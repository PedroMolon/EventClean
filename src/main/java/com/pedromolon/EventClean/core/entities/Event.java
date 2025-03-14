package com.pedromolon.EventClean.core.entities;

import com.pedromolon.EventClean.core.enums.TipoEvento;

import jakarta.persistence.Table;

public record Event(
    Long id,
    String nome,
    String descricao,
    String identificador,
    LocalDateTime dataInicio,
    LocalDateTime dataFim,
    String local,
    String organizador,
    TipoEvento tipoEvento,
) {}
