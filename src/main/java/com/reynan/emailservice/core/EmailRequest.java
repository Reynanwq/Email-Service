package com.reynan.emailservice.core;

public record EmailRequest(String to, String subject, String body) {
    /*. A partir do Java 14, foi introduzido um novo recurso chamado "records",
    que é uma forma concisa de definir classes imutáveis, principalmente utilizadas para representar dados.
    Em um registro, você pode declarar os campos da classe diretamente na assinatura da classe,
    e o compilador automaticamente gera vários métodos comuns, como equals(), hashCode() e toString().*/
}
