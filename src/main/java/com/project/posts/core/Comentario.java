package com.project.posts.core;

import java.util.ArrayList;
import java.util.List;

class Comentario extends Publicacao {

    private List<Comentario> respostas = new ArrayList<>();

    public Comentario(String texto, long autorId) {
        super(texto, autorId);
    }

    public void adicionarResposta(Comentario resposta) {
        this.respostas.add(resposta);
    }

}
