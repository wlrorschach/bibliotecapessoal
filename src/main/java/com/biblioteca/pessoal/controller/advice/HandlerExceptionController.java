package com.biblioteca.pessoal.controller.advice;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.biblioteca.pessoal.exception.OperacaoException;
import com.biblioteca.pessoal.exception.ResourceNotFoundException;
import com.biblioteca.pessoal.exception.ValidationException;
import com.biblioteca.pessoal.model.dto.MensagemDTO;

@RestControllerAdvice
public class HandlerExceptionController {

    @ResponseStatus(value = HttpStatus.INTERNAL_SERVER_ERROR)
    @ExceptionHandler(value = ValidationException.class)
    public MensagemDTO handleValidationException(final ValidationException excecao) {
        return new MensagemDTO(excecao.getMessage());
    }

    @ResponseStatus(value = HttpStatus.INTERNAL_SERVER_ERROR)
    @ExceptionHandler(value = OperacaoException.class)
    public MensagemDTO handlerOperacaoException(final OperacaoException exception) {
        return new MensagemDTO(exception.getMessage());
    }

    @ResponseStatus(value = HttpStatus.BAD_REQUEST)
    @ExceptionHandler(value = ResourceNotFoundException.class)
    public MensagemDTO handlerResourceNotFoundException(final ResourceNotFoundException exception) {
        return new MensagemDTO(exception.getMessage());
    }
}
