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
@Table(name = "RL_LIVRO_CATEGORIA")
@Data
public class RelacaoLivroCategoria {

    @Id
    @NotNull
    @Column(name = "IDLIVROVATEGORIA")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    @ManyToOne
    @JoinColumn(name = "ID_LIVRO", referencedColumnName = "IDLIVRO")
    private Livro livro;

    @NotNull
    @ManyToOne
    @JoinColumn(name = "ID_CATEGORIA", referencedColumnName = "IDCATEGORIA")
    private Categoria categoria;

}
