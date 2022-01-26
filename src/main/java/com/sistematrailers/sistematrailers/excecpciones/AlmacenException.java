package com.sistematrailers.sistematrailers.excecpciones;

public class AlmacenException extends RuntimeException{

    public AlmacenException(String mensaje){
        super(mensaje);
    }

    public AlmacenException(String mensaje, Throwable exception){
        super(mensaje, exception);
    }


}
