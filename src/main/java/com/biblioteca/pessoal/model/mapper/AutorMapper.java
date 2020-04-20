package com.biblioteca.pessoal.model.mapper;

import java.util.List;

import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;

import com.biblioteca.pessoal.model.dto.AutorDTO;
import com.biblioteca.pessoal.model.enitity.Autor;
import com.biblioteca.pessoal.model.interfaces.BaseMapper;
import com.biblioteca.pessoal.model.support.PageableResponseModel;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface AutorMapper extends BaseMapper<Autor, AutorDTO> {
    AutorMapper INSTANCE = Mappers.getMapper(AutorMapper.class);

    AutorDTO toDto(Autor entity);

    Autor toEntity(AutorDTO dto);

    List<AutorDTO> toDto(List<Autor> entities);

    List<AutorDTO> toDto(Iterable<Autor> entities);

    List<Autor> toEntity(List<AutorDTO> dtos);

    PageableResponseModel<AutorDTO> toDtoPageableResponse(
            PageableResponseModel<Autor> pageableResponseModel);

}
