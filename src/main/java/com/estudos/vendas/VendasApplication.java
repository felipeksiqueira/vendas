package com.estudos.vendas;

import com.estudos.vendas.confiiguration.MinhaConfiguration;
import com.estudos.vendas.model.Animal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class VendasApplication {

	@Cachorro
	Animal animal;

	@Value("${application.names}")
	private String applicationName;

	@Bean("executarAnimal")
	public CommandLineRunner executar(){
		return args -> {
			animal.fazerBerulho();
		};
	}

	@GetMapping("/hello")
	public String helloWord(){
		return applicationName;
	}
	public static void main(String[] args) {
		SpringApplication.run(VendasApplication.class, args);
	}

}
