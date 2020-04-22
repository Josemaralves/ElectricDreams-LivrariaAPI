package br.com.electricdreams.livrariaapi.controller;

import br.com.electricdreams.livrariaapi.model.LivroVO;
import br.com.electricdreams.livrariaapi.service.LivroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/livro")
public class LivroController {

    @Autowired
    LivroService service;

    @GetMapping("/procurar/autor/{idAutor}")
    public List<LivroVO> procurarLivroPorAutor(@PathVariable("idAutor") String id){
        return service.procurarPorAutor(id);
    }

    @PostMapping("/cadastrar/livro")
    public ResponseEntity cadastrarLivroNoAutor(@RequestBody LivroVO livro){
        service.cadastrarLivro(livro);
        return new ResponseEntity(HttpStatus.OK);
    }


}
