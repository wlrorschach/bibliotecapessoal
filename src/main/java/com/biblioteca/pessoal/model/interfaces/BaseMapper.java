package com.biblioteca.pessoal.model.interfaces;

import java.util.List;

import com.biblioteca.pessoal.model.support.PageableResponseModel;

public interface BaseMapper<E, D> {

    D toDto(E entity);

    E toEntity(D dto);

    List<D> toDto(List<E> entities);

    List<D> toDto(Iterable<E> entities);

    List<E> toEntity(List<D> dtos);

//    void fromDto(D dto, E entity);

    PageableResponseModel<D> toDtoPageableResponse(PageableResponseModel<E> pageableResponseModel);
}
