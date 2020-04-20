package com.biblioteca.pessoal.model.dto;

import java.io.Serializable;

import lombok.Data;

@Data
public class CategoriaDTO implements Serializable {
    private static final long serialVersionUID = -8740141324808008426L;

    private Long id;

    private String nome;
    
    private String descricao;

}
