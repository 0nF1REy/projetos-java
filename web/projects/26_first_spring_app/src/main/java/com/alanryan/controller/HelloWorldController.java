package com.alanryan.first_spring_app.controller;

import com.alanryan.first_spring_app.service.HelloWorldService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import com.alanryan.first_spring_app.domain.User;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Controlador para a API Hello World.
 * Explica os tipos de APIs:
 * - **Stateless**: O servidor não mantém estado entre requisições.
 * - **Stateful**: O servidor mantém estado entre requisições.
 */
@RestController
@RequestMapping("/hello-world")
public class HelloWorldController {

    // ==============
    //  Sem construtor
    // ==============
    @Autowired
    private HelloWorldService helloWorldService;

    // ==============
    //  Com construtor
    // ==============
    // public HelloWorldController(HelloWorldService helloWorldService) {
    //    this.helloWorldService = helloWorldService;
    // }

    /**
     * Endpoint GET que retorna a mensagem "Hello World!".
     * Métodos HTTP comuns: POST, GET, DELETE, PUT, PATCH, OPTIONS, HEAD.
     */
    @GetMapping
    public String helloWorld() {
        return helloWorldService.helloWorld("Alan");
    }

    @PostMapping("/{id}")
    public String helloWorldPost(@PathVariable("id") String id,@RequestParam(value = "filter", defaultValue = "nenhum") String filter,@RequestBody User body) {
        return "Hello World " + filter;
    }
}
