package com.biblioteca.pessoal.model.dto;

import java.io.Serializable;
import java.util.List;

import lombok.Data;

@Data
public class AutorDTO implements Serializable {
    private static final long serialVersionUID = -8740141324808008426L;

    private Long id;

    private String nome;

    private List<LivroDTO> livros;

}
