package com.project.posts.core;

import java.time.LocalDateTime;

abstract class Publicacao {

    private Long id;

    private Autor autor;

    private String texto;

    private LocalDateTime data;

    public Publicacao(String texto, Autor autor) {
        this.autor = autor;
        this.texto = texto;
        data = LocalDateTime.now();
    }

    public Long getId() {
        return id;
    }

    public Autor getAutor() {
        return autor;
    }

    public String getTexto() {
        return texto;
    }

    public LocalDateTime getData() {
        return data;
    }
}
