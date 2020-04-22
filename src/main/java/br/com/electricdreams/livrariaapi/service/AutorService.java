package br.com.electricdreams.livrariaapi.service;

import br.com.electricdreams.livrariaapi.model.AutorVO;

import java.util.List;

public interface AutorService {

    List<AutorVO> findAll();
    AutorVO procurarPorID(String id);
    void cadastrarAutor(AutorVO vo);

}
