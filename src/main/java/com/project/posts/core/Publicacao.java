package com.project.posts.core;

import java.time.LocalDateTime;

public abstract class Publicacao {

    private String autor;

    private String texto;

    private LocalDateTime data;

    public Publicacao(String texto, String autor) {
        this.autor = autor;
        this.texto = texto;
        data = LocalDateTime.now();
    }
}
