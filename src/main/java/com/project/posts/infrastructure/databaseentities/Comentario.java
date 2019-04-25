package com.project.posts.infrastructure.databaseentities;

import javax.persistence.*;

@Entity
public class Comentario {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String texto;

    @ManyToOne
    private PostagemEntity postagemEntity;

    @ManyToOne
    private AutorEntity autorEntity;
}
