package com.biblioteca.pessoal.exception;

public class OperacaoException extends RuntimeException {
    private static final long serialVersionUID = -8703034877899016124L;

    public OperacaoException() {
        this(null, null);
    }

    public OperacaoException(final String mensagem) {
        this(mensagem, null);
    }

    public OperacaoException(final Throwable causa) {
        this(null, causa);
    }

    public OperacaoException(final String mensagem, final Throwable causa) {
        super(mensagem, causa);
    }
}
