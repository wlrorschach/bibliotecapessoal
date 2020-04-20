package com.biblioteca.pessoal.exception;

public class ValidationException extends RuntimeException {
    private static final long serialVersionUID = -8703034877899016124L;

    public ValidationException() {
        this(null, null);
    }

    public ValidationException(final String mensagem) {
        this(mensagem, null);
    }

    public ValidationException(final Throwable causa) {
        this(null, causa);
    }

    public ValidationException(final String mensagem, final Throwable causa) {
        super(mensagem, causa);
    }
}
