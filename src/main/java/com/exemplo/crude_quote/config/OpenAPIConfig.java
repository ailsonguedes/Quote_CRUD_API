package com.exemplo.crude_quote.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;

@Configuration
public class OpenAPIConfig {

    @Bean
    public OpenAPI customOpenAPI() {
        return new OpenAPI()
                .info(new Info()
                        .title("Quotes API")
                        .description("An API to store car details built using Spring Boot 3 + OpenAPI")
                        .version("1.0.0"));
    }
}
