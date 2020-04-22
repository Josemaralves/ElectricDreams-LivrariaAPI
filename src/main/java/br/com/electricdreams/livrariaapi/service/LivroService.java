package br.com.electricdreams.livrariaapi.service;

import br.com.electricdreams.livrariaapi.model.LivroVO;

import java.util.List;

public interface LivroService {
    List<LivroVO> procurarPorAutor(String id);
    void cadastrarLivro(LivroVO livro);
}
