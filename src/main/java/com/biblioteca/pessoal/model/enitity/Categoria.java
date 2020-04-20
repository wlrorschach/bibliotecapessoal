package com.biblioteca.pessoal.model.enitity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import lombok.Data;

@Entity
@Table(name = "TB_CATEGORIA")
@Data
public class Categoria {
    
    @Id
    @NotNull
    @Column(name = "IDCATEGORIA")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Column(name = "NOME")
    private String nome;
    
    @Column(name = "DESCRICAO")
    private String descricao;

}
