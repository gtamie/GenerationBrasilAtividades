package com.helloworld.atividade1.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/bsm") //bsm - Behavioral Skills and Mindsets

public class Atividade1Controller {
	
	@GetMapping
	public String bsm() {
		return "Atenção aos Detalhes, Persistência e Mentalidade de Crescimento.";
	}
}
