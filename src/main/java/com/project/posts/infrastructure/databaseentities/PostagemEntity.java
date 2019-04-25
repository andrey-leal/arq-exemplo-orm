package com.project.posts.infrastructure.databaseentities;

import javax.persistence.*;
import java.util.List;

@Entity
public class PostagemEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String texto;

    private Long autorId;

    @OneToMany(mappedBy = "postagem", cascade = CascadeType.ALL)
    private List<ComentarioEntity> comentarios;

}
