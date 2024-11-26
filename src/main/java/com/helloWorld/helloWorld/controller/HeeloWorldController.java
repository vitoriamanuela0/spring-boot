package com.helloWorld.helloWorld.controller;

import java.util.Arrays;
import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello-world")

public class HeeloWorldController {

@GetMapping
	public String helloworld() {
		return "Hello World!!!";
	}
	
@GetMapping("/bsm")
    public List<String> bsmList() {
        return Arrays.asList(
            "Orientação ao futuro.",
            "Responsabilidade pessoal.",
            "Mentalidade de crescimento.",
            "Persistência.",
            "Comunicação.",
            "Trabalho em equipe.",
            "Atenção aos detalhes.",
            "Proatividade."
        );
    }
}
