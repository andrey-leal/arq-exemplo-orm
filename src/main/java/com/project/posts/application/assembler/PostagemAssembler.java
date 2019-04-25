package com.project.posts.application.assembler;

import com.project.posts.application.dto.PostagemResponse;
import com.project.posts.core.Postagem;

public class PostagemAssembler {

    public PostagemResponse criarPostagemResponse(Postagem postagem) {
        PostagemResponse response = new PostagemResponse();
        response.setTexto(postagem.getTexto());
        response.setAutorId(postagem.getAutorId());
        response.setData(postagem.getData());
        return response;
    }


}
