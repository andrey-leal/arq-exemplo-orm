package com.project.posts.application.assembler;

import com.project.posts.application.dto.PostagemResponse;
import com.project.posts.core.Postagem;

public class PostagemAssembler {

    public PostagemResponse criarPostagemResponse(Postagem postagem) {
        PostagemResponse response = new PostagemResponse();
        response.setTexto(postagem.getTexto());
        response.setAutor(postagem.getAutor().getNomeCompleto());
        response.setData(postagem.getData());
        return response;
    }


}
