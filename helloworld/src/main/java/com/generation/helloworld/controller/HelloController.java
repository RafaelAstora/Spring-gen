package com.generation.helloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


//indica que esta é uma classe controladora
@RestController

//indica um end point para nos	sa aplicação
@RequestMapping("/hello")

public class HelloController {

	@GetMapping
	public String oiMundo(){
		
		return "Hello World";
	}
	
	@GetMapping("/BSMs")

	public String bsm(){
		
		return "mentalidade de crescimento\r\n"
				+ "Persistencia\r\n"
				+ "Responsabilidade Pessoal\r\n"
				+ "Orientação ao futuro\r\n"
				+ "Comunicação\r\n"
				+ "Orientação ao detalhe\r\n"
				+ "Proatividade\r\n"
				+ "trabalho em equipe\r\n"
				+ "Gestão de Tempo";
	}	
	
	@GetMapping("/objetivos")
	
	public String objetivos() {
		return "Objetivos da semana:\r\n\n"
				+ "- Treinar Figma\r\n"
				+ "- Estudar JavaFX\r\n"
				+ "- Terminar Quiz faculdade\r\n";
	}
}
