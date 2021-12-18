package com.example.greetings;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class GreetingsApplication {

	public static void main(String[] args) {
		SpringApplication.run(GreetingsApplication.class, args);
	}

	@Bean
    public CommandLineRunner commandLineRunner(ApplicationContext ctx) {
	
		HelloWorld helloWorld = new HelloWorld();
		return args -> {
			helloWorld.greet();
		};
	}
}
