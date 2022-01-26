package com.sistematrailers.sistematrailers.excecpciones;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code = HttpStatus.NOT_FOUND)
public class FileNOTFoundException extends RuntimeException{

    public FileNOTFoundException(String mensaje){
        super(mensaje);
    }

    public FileNOTFoundException(String mensaje, Throwable exception){
        super(mensaje, exception);
    }
}
