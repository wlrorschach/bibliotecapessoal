package com.biblioteca.pessoal.model.repository;

import org.springframework.data.repository.CrudRepository;

import com.biblioteca.pessoal.model.enitity.Livro;

public interface AutorRepository extends CrudRepository<Livro, Long> {

}
