package com.project.posts.entrypoint;

import com.project.posts.application.dto.PostagemRequest;
import com.project.posts.application.service.PostagemService;
import com.project.posts.application.service.PostagemServiceImpl;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PublicacaoResource {

    private PostagemServiceImpl postagemService;

    @PostMapping("/postagem")
    public void publicar(@RequestBody PostagemRequest request) {
        this.postagemService.postar(request);
    }
}
