package com.aos.aula02.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.aos.aula02.demo.model.Autor;
import com.aos.aula02.demo.service.AutorService;

@RequestMapping("/api/v1/auto/")
@RestController
public class AutorController {

    @Autowired
    public AutorService autorService;

    @PostMapping
    public Autor inserirAutor(@RequestBody Autor autor){
        return autorService.inserirAutor(autor);

    @GetMapping
    public List<Autor> gettodosAutores(){
        return autorService.buscarTodosAutores();
    }

    @GetMapping
    @RequestMapping("CPF/{CPF}")
    public Autor buscarAutorPeloCPF(@PathVariable String CPF){
        return autorService.buscarPeloCPF(CPF);
    }

}
}
