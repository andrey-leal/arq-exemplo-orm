package com.project.posts.core;

import java.util.ArrayList;
import java.util.List;

class Comentario extends Publicacao {

    private List<Comentario> respostas = new ArrayList<>();

    public Comentario(String texto, String autor) {
        super(texto, autor);
    }

    public void adicionarResposta(Comentario resposta) {
        this.respostas.add(resposta);
    }

}
