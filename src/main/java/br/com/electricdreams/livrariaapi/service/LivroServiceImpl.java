package br.com.electricdreams.livrariaapi.service;

import br.com.electricdreams.livrariaapi.model.LivroVO;
import br.com.electricdreams.livrariaapi.repository.LivroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LivroServiceImpl implements LivroService {

    @Autowired
    LivroRepository repository;

    @Override
    public List<LivroVO> procurarPorAutor(String id) {
        return repository.findAllByAutor(id);
    }

    @Override
    public void cadastrarLivro(LivroVO livro) {
        repository.save(livro);
    }
}
