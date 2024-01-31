package com.reynan.emailservice.core;

public interface EmailSenderUserCase {
    //aqui defininmos uma interface, que vai ser um contraton para o mais alto nível da nossa aplicação
    //aqui definimos os casos de uso e a regra de negocio da nossa aplicação
    void sendEmail(String to, String subject, String body);
}
