package com.biblioteca.pessoal.model.dto;

import java.io.Serializable;

import lombok.Data;

@Data
//@AllArgsConstructor
public class MensagemDTO implements Serializable {
    public MensagemDTO(String mensagem) {
        super();
        this.mensagem = mensagem;
    }

    private static final long serialVersionUID = -8740141324808008426L;

    private String mensagem;
}
