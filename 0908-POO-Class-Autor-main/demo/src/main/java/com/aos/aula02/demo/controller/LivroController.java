package com.aos.aula02.demo.controller;

@RequestController
@RequestMapping("api/if/livro/")
public class LivroController {
    @Autowired
    public LivroService livroService;

    @PostMapping("save/")
    public Livro inserirLivro(@RequestBody Livro livro) {
        return livroService.inserir(livro);
    }
    @GetMapping
    public List<Livro> buscarTodosLivros() {
        return livroService.buscarTodos();
    }

}
