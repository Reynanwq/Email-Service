package com.reynan.emailservice.core.exceptions;

import com.reynan.emailservice.application.EmailSenderService;

public class EmailServiceException extends RuntimeException{
    //tratamento de errros
    public EmailServiceException(String message){
        super(message); //chamando o construtor da classe RuntimeException e passando a mensagem de erro como argumento.
    }

    public EmailServiceException(String message, Throwable cause){
        super(message, cause);
    }
}
