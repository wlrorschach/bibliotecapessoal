package com.biblioteca.pessoal.model.mapper;

import java.util.List;

import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;

import com.biblioteca.pessoal.model.dto.PaisDTO;
import com.biblioteca.pessoal.model.enitity.Pais;
import com.biblioteca.pessoal.model.interfaces.BaseMapper;
import com.biblioteca.pessoal.model.support.PageableResponseModel;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface PaisMapper extends BaseMapper<Pais, PaisDTO> {
    PaisMapper INSTANCE = Mappers.getMapper(PaisMapper.class);

    PaisDTO toDto(Pais entity);

    Pais toEntity(PaisDTO dto);

    List<PaisDTO> toDto(List<Pais> entities);

    List<PaisDTO> toDto(Iterable<Pais> entities);

    List<Pais> toEntity(List<PaisDTO> dtos);

    PageableResponseModel<PaisDTO> toDtoPageableResponse(
            PageableResponseModel<Pais> pageableResponseModel);

}
