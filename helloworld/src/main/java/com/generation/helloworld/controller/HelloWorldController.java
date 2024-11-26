package com.generation.helloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class HelloWorldController {
	
	@GetMapping("/hello-world")
	public String helloworld() {
		return "Hello World!!!";
	}

	@GetMapping("/objectives")
	public String objective() {
		return "Aprender a trabalhar com Spring Boot\n"
				+ "Praticar mais\n"
				+ "Me atentar aos detalhes";
	}
	
	@GetMapping("/bsm")
	public String listBSM() {
		return "Orientação ao Detalhe\n"
				+ "Mentalidade de Crescimento\n"
				+ "Orientação ao futuro\n"
				+ "Persistência\n"
				+ "Trabalho em equipe\n"
				+ "Atenção ao detalhe\n"
				+ "Proatividade\n"
				+ "Comunicação";
				
	}
}
