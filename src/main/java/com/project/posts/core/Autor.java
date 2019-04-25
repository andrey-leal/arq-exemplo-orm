package com.project.posts.core;

public class Autor {

    private Long id;

    private String nome;

    private String sobrenome;

    public String getNomeCompleto() {
        return nome + " " + sobrenome;
    }

}
