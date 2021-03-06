package com.biblioteca.pessoal.model.enitity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import lombok.Data;

@Entity
@Table(name = "TB_LIVRO")
@Data
public class Livro {

    @Id
    @Column(name = "IDLIVRO")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    @Column(name = "NOME")
    private String nome;

    @NotNull
    @ManyToOne
    @JoinColumn(name = "ID_AUTOR", referencedColumnName = "IDAUTOR")
    private Autor autor;

}
