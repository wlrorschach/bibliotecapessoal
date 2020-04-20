package com.biblioteca.pessoal.model.mapper;

import java.util.List;

import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;

import com.biblioteca.pessoal.model.dto.CategoriaDTO;
import com.biblioteca.pessoal.model.enitity.Categoria;
import com.biblioteca.pessoal.model.interfaces.BaseMapper;
import com.biblioteca.pessoal.model.support.PageableResponseModel;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface CategoriaMapper extends BaseMapper<Categoria, CategoriaDTO> {
    CategoriaMapper INSTANCE = Mappers.getMapper(CategoriaMapper.class);

    CategoriaDTO toDto(Categoria entity);

    Categoria toEntity(CategoriaDTO dto);

    List<CategoriaDTO> toDto(List<Categoria> entities);

    List<CategoriaDTO> toDto(Iterable<Categoria> entities);

    List<Categoria> toEntity(List<CategoriaDTO> dtos);

    PageableResponseModel<CategoriaDTO> toDtoPageableResponse(
            PageableResponseModel<Categoria> pageableResponseModel);


}
