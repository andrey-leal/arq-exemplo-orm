package com.project.posts.core;

import org.springframework.util.StringUtils;

import java.util.ArrayList;
import java.util.Collection;

public class Postagem extends Publicacao {

    private Collection<Comentario> comentarios = new ArrayList<>();

    private Postagem(String texto, long autorId) {
        super(texto, autorId);
    }


    public static Postagem criar(String texto, long autorId) {
        if(StringUtils.hasText(texto)) {
            return new Postagem(texto, autorId) ;
        }
        return null;
    }

    public void escreverComentario(Comentario comentario) {
        comentarios.add(comentario);
    }

    public void apagarComentario(Comentario comentario) {
        comentarios.remove(comentario);
    }

    public Collection<Comentario> getComentarios() {
        return comentarios;
    }
}
