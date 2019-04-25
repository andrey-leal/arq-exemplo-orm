package com.project.posts.core;

import java.time.LocalDateTime;

abstract class Publicacao {

    private Long id;

    private long autorId;

    private String texto;

    private LocalDateTime data;

    public Publicacao(String texto, long autorId) {
        this.autorId = autorId;
        this.texto = texto;
        data = LocalDateTime.now();
    }

    public Long getId() {
        return id;
    }

    public long getAutorId() {
        return autorId;
    }

    public String getTexto() {
        return texto;
    }

    public LocalDateTime getData() {
        return data;
    }
}
