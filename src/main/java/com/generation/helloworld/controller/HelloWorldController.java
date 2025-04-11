package com.generation.helloworld.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello-world")

public class HelloWorldController {

	@GetMapping
	public String helloworld() {

		return "Hello World";
	}

	@GetMapping("/bsms")
	public List<String> bsms() {
		return List.of("Responsabilidade Pessoal", "Mentalidade de Crescimento", "Orientação ao Futuro", "Persistência",
				"Trabalho em Equipe", "Proatividade", "Comunicação", "Orientação ao Detalhe");
	}

	@GetMapping("/objetivos")
	public List<String> objetivosSemana() {
		return List.of("Revisar lógica de programação", "Praticar Spring Boot", "Aprimorar uso do Git e GitHub",
				"Estudar banco de dados relacional");
	}

}
