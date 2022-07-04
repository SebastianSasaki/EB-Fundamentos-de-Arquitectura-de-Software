package com.example.finalexam.configuration;

import io.swagger.v3.oas.models.Components;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class OpenApiConfiguration {
    @Bean(name = "FinalExamOpenApi")
    public OpenAPI finalExamOpenAPI(){
        return new OpenAPI()
                .components(new Components())
                .info(new Info()
                        .title("Final Exam - API")
                        .description("Final Exam implementado con Spring boot RESTful service y documentado con spingdoc_openapi y OpenAPI 3.0 "));
    }
}