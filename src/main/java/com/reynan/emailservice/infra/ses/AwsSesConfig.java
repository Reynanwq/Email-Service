package com.reynan.emailservice.infra.ses;

import com.amazonaws.services.simpleemail.AmazonSimpleEmailService;
import com.amazonaws.services.simpleemail.AmazonSimpleEmailServiceClientBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration //executa antes da aplicação
public class AwsSesConfig {
    //para que o spring faça a instacia correta da chave da amazon
    @Bean
    public AmazonSimpleEmailService amazonSimpleEmailService(){
        return AmazonSimpleEmailServiceClientBuilder.standard().build();
    }
}
