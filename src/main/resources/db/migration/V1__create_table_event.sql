-- V1__create_table_event.sql

CREATE TABLE evento (
    id BIGSERIAL PRIMARY KEY,
    nome VARCHAR(255) NOT NULL,
    descricao TEXT,
    identificador VARCHAR(255) NOT NULL UNIQUE,
    data_inicio TIMESTAMP NOT NULL,
    data_fim TIMESTAMP NOT NULL,
    local_evento VARCHAR(255) NOT NULL,
    capacidade INTEGER NOT NULL,
    organizador VARCHAR(255) NOT NULL,
    tipo_evento VARCHAR(255) NOT NULL
);
