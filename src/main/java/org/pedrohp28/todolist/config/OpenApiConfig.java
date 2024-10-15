package org.pedrohp28.todolist.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class OpenApiConfig {
    @Bean
    public OpenAPI customOpenAPI(){
        return new OpenAPI()
                .info(new Info()
                        .title("To Do List API")
                        .version("v1")
                        .description("Api de lista de tarefas")
                        .termsOfService("https://github.com/pedrohp28")
                        .license(
                                new License()
                                        .name("Apache 2.0")
                                        .url("https://github.com/pedrohp28")));
    }
}
