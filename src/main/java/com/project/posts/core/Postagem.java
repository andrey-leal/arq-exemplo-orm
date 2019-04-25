package com.project.posts.core;

import java.util.ArrayList;
import java.util.Collection;

public class Postagem extends Publicacao {

    private Collection<Comentario> comentarios = new ArrayList<>();

    public Postagem(String texto, String autor) {
        super(texto, autor);
    }

    public void escreverComentario(Comentario comentario) {
        comentarios.add(comentario);
    }

    public void apagarComentario(Comentario comentario) {
        comentarios.remove(comentario);
    }






}
