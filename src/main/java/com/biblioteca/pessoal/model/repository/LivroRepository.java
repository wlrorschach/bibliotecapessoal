package com.biblioteca.pessoal.model.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.biblioteca.pessoal.model.enitity.Livro;

@Repository
public interface LivroRepository extends CrudRepository<Livro, Long> {

}
