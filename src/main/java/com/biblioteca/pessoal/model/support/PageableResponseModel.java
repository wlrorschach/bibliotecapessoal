package com.biblioteca.pessoal.model.support;

import java.util.List;

import lombok.Data;

@Data
public class PageableResponseModel<T> {

    private Long total;

    private List<T> items;

}
