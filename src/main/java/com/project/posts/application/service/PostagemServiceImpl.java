package com.project.posts.application.service;

import com.project.posts.application.dto.ComentarioRequest;
import com.project.posts.application.dto.PostagemRequest;
import com.project.posts.core.Postagem;

public class PostagemServiceImpl implements PostagemService {

    @Override
    public void postar(PostagemRequest postagemRequest) {
        Postagem postagem = Postagem.criar(postagemRequest.getTexto(), postagemRequest.getAutor());
    }

    @Override
    public void comentar(Long id, ComentarioRequest comentario) {

    }

    @Override
    public void editar(Long id, PostagemRequest postagem) {

    }

    @Override
    public void apagar(Long id) {

    }
}
