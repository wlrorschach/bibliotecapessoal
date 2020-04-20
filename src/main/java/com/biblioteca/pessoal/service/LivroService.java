package com.biblioteca.pessoal.service;

import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.biblioteca.pessoal.exception.OperacaoException;
import com.biblioteca.pessoal.exception.ResourceNotFoundException;
import com.biblioteca.pessoal.exception.ValidationException;
import com.biblioteca.pessoal.model.dto.LivroDTO;
import com.biblioteca.pessoal.model.enitity.Autor;
import com.biblioteca.pessoal.model.enitity.Livro;
import com.biblioteca.pessoal.model.mapper.AutorMapper;
import com.biblioteca.pessoal.model.mapper.CategoriaMapper;
import com.biblioteca.pessoal.model.mapper.LivroMapper;
import com.biblioteca.pessoal.model.repository.AutorRepository;
import com.biblioteca.pessoal.model.repository.CategoriaRepository;
import com.biblioteca.pessoal.model.repository.LivroRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
@Transactional(propagation = Propagation.SUPPORTS)
public class LivroService {

    // MAPPERS
    private final LivroMapper livroMap;
    private final AutorMapper autorMap;
    private final CategoriaMapper categoriaMap;

    // REPOSITORIOS
    private final LivroRepository livroRepo;
    private final AutorRepository autorRepo;
    private final CategoriaRepository categoriaRepo;

    @Transactional(propagation = Propagation.REQUIRED)
    public LivroDTO incluir(LivroDTO dto) {

        try {

            Livro entity = livroMap.toEntity(dto);

            return livroMap.toDto(livroRepo.save(entity));

        } catch (DataAccessException e) {
            throw new OperacaoException("Erro ao incluir. Erro: " + e.getMessage());
        }
    }

    public LivroDTO obterPorId(Long id) {
        if (null == id) {
            throw new ValidationException("Id nao informado");
        }

        return livroMap.toDto(livroRepo.findById(id).orElseThrow(ResourceNotFoundException::new));
    }

}
