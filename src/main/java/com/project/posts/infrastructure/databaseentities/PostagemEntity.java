package com.project.posts.infrastructure.databaseentities;

import javax.persistence.*;
import java.util.List;

@Entity
public class PostagemEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String texto;

    @ManyToOne
    private AutorEntity autorEntity;

    @OneToMany(mappedBy = "postagem", cascade = CascadeType.ALL)
    private List<Comentario> comentarios;

    public Long getId() {
        return id;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public AutorEntity getAutorEntity() {
        return autorEntity;
    }

    public void setAutorEntity(AutorEntity autorEntity) {
        this.autorEntity = autorEntity;
    }

    public List<Comentario> getComentarios() {
        return comentarios;
    }

    public void setComentarios(List<Comentario> comentarios) {
        this.comentarios = comentarios;
    }
}
