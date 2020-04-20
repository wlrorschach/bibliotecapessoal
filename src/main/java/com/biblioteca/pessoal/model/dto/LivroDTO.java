package com.biblioteca.pessoal.model.dto;

import java.io.Serializable;

import javax.validation.constraints.NotNull;

import lombok.Data;

@Data
public class LivroDTO implements Serializable {
    private static final long serialVersionUID = -8740141324808008426L;

    private Long id;

    @NotNull
    private String nome;

    private AutorDTO autor;

    private CategoriaDTO categoria;
}
