package com.biblioteca.pessoal.model.mapper;

import java.util.List;

import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;

import com.biblioteca.pessoal.model.dto.LivroDTO;
import com.biblioteca.pessoal.model.enitity.Livro;
import com.biblioteca.pessoal.model.interfaces.BaseMapper;
import com.biblioteca.pessoal.model.support.PageableResponseModel;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface LivroMapper extends BaseMapper<Livro, LivroDTO> {
    LivroMapper INSTANCE = Mappers.getMapper(LivroMapper.class);

    LivroDTO toDto(Livro entity);

    Livro toEntity(LivroDTO dto);

    List<LivroDTO> toDto(List<Livro> entities);

    List<LivroDTO> toDto(Iterable<Livro> entities);

    List<Livro> toEntity(List<LivroDTO> dtos);

    PageableResponseModel<LivroDTO> toDtoPageableResponse(
            PageableResponseModel<Livro> pageableResponseModel);

}
