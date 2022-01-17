package com.helloworld.atividade2.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/objetivo")
public class Atividade2Controller {
	
	@GetMapping
	public String objetivo() {
		return "Objetivos de aprendizagem da semana: conseguir aplicar a camada controller";
	}

}
