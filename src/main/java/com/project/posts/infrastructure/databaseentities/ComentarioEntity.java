package com.project.posts.infrastructure.databaseentities;

import javax.persistence.*;

@Entity
public class ComentarioEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String texto;

    @ManyToOne
    private PostagemEntity postagem;

    private Long autorId;
}
