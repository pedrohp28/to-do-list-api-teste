package org.pedrohp28.todolist;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.servers.Server;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.logging.Logger;

@SpringBootApplication
@OpenAPIDefinition(servers = { @Server(url = "/", description = "Default Server URL")})
public class ToDoListApplication {

	public static void main(String[] args) {
		SpringApplication.run(ToDoListApplication.class, args);

		Logger logger = Logger.getLogger(ToDoListApplication.class.getName());
		logger.info("You find the documentation in http://localhost:8080/swagger-ui/index.html");
	}

}
