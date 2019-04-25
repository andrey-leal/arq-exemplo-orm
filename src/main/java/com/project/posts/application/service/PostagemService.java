package com.project.posts.application.service;

import com.project.posts.application.dto.ComentarioRequest;
import com.project.posts.application.dto.PostagemRequest;

public interface PostagemService {
    void postar(PostagemRequest postagem);
    void comentar(Long id, ComentarioRequest comentario);
    void editar(Long id, PostagemRequest postagem);
    void apagar(Long id);
}
