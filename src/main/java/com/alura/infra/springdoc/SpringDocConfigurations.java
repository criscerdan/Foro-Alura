package com.alura.infra.springdoc;

import io.swagger.v3.oas.models.Components;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
import io.swagger.v3.oas.models.security.SecurityScheme;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration// Esta anotacion le indica a Spring que esta clase sera autoinstanciada en el contexto de Spring Framework
public class SpringDocConfigurations {
    @Bean
    public OpenAPI customOpenAPI() {
        return new OpenAPI()
                .components(new Components()
                        .addSecuritySchemes("bearer-key",
                                new SecurityScheme()
                                        .type(SecurityScheme.Type.HTTP)
                                        .scheme("bearer")
                                        .bearerFormat("JWT")))
                .info(new Info()
                        .title("API Rest del Foro Alura")
                        .description("Es un API rest del foro de alura, con las funciones CRUD para los topicos ")
                        .contact(new Contact()
                                .name("Backend-Team")
                                .email("alura.backend@team.com")));
    }

    @Bean
    public void message(){
        System.out.println("bearer is working");
    }


}
