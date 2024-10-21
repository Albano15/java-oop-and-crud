package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")  // Corrigido para usar aspas duplas
public class HelloWorldController {
    @GetMapping
    public String helloWorld() {
        return "Hello World";
    }

    @GetMapping("/bomdia")
    public String Bomdia() {
        return "Bom dia";
    }

    @GetMapping("/boanoite/{nome}")
    public String BoaNoite(@PathVariable String nome) {
        return "Boa noite " + nome;
    }


}
