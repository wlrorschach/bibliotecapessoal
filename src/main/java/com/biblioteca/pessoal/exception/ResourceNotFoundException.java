package com.biblioteca.pessoal.exception;

public class ResourceNotFoundException extends RuntimeException {
    private static final long serialVersionUID = -8703034877899016124L;

    public ResourceNotFoundException() {
        this(null, null);
    }

    public ResourceNotFoundException(final String mensagem) {
        this(mensagem, null);
    }

    public ResourceNotFoundException(final Throwable causa) {
        this(null, causa);
    }

    public ResourceNotFoundException(final String mensagem, final Throwable causa) {
        super(mensagem, causa);
    }
}
