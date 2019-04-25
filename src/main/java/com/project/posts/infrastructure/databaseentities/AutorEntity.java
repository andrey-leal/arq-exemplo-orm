package com.project.posts.infrastructure.databaseentities;

import javax.persistence.*;
import java.util.List;

@Entity
public class AutorEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String nome;

    @OneToMany(mappedBy = "autor", cascade = CascadeType.ALL)
    private List<PostagemEntity> postagens;

    @OneToMany(mappedBy = "autor", cascade = CascadeType.ALL)
    private List<Comentario> comentarios;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<PostagemEntity> getPostagens() {
        return postagens;
    }

    public void setPostagens(List<PostagemEntity> postagens) {
        this.postagens = postagens;
    }

    public List<Comentario> getComentarios() {
        return comentarios;
    }

    public void setComentarios(List<Comentario> comentarios) {
        this.comentarios = comentarios;
    }
}
