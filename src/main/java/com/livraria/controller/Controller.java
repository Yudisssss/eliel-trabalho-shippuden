package com.livraria.controller;

import com.livraria.model.Book;
import com.livraria.model.Periodico;
import com.livraria.model.Usuario;
import com.livraria.service.BookService;
import com.livraria.service.EmprestimoSerivce;
import com.livraria.service.PeriodicoService;
import com.livraria.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RequestMapping("/emprestimos")
@RestController
public class Controller {
    @Autowired
    private  EmprestimoSerivce service;
    @Autowired
    private BookService bookService;
    @Autowired
    private UsuarioService usuarioService;
    @Autowired
    private PeriodicoService periodicoService;

    @PostMapping("/realizar/{usuarioId}/{tipoItem}/{itemId}")
    public String realizar(@PathVariable Long usuarioId, @PathVariable String tipoItem, @PathVariable Long itemId) {
        return service.realizarEmprestimo(usuarioId, tipoItem, itemId);
    }

    @PostMapping("/devolver/{id}")
    public String devolver(@PathVariable Long id) {
        return service.devolverItem(id);
    }

    @PostMapping("/livro")
    public Book salvarLivro(@RequestBody Book book){
        return bookService.salvar(book);
    }
    @PostMapping("/user")
    public Usuario salvarUser(@RequestBody Usuario usuario){
        return usuarioService.salvarUsuario(usuario);
    }
    @PostMapping("/periodico")
    public Periodico salvarPeriodico(@RequestBody Periodico periodico){
        return periodicoService.salvarPeridico(periodico);
    }
}
