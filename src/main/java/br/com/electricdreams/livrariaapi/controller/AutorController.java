package br.com.electricdreams.livrariaapi.controller;

import br.com.electricdreams.livrariaapi.model.AutorVO;
import br.com.electricdreams.livrariaapi.service.AutorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/autor")
public class AutorController {

    @Autowired
    private AutorService autorService;

    @GetMapping(value = "/todos")
    public List<AutorVO> findAll(){
        return autorService.findAll();
    };

    @GetMapping(value = "/procurar/id/{id}")
    public AutorVO findById(@PathVariable("id") String id){
        return autorService.procurarPorID(id);
    };

    @PostMapping(value = "/criar")
    public ResponseEntity cadastrar(@RequestBody AutorVO vo){
        autorService.cadastrarAutor(vo);
        return new ResponseEntity(HttpStatus.OK);
    }

}
