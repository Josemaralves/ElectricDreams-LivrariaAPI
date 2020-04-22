package br.com.electricdreams.livrariaapi.service;

import br.com.electricdreams.livrariaapi.model.AutorVO;
import br.com.electricdreams.livrariaapi.repository.AutorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AutorServiceImpl implements AutorService {

    @Autowired
    AutorRepository autorRepository;

    @Override
    public List<AutorVO> findAll() {
        return autorRepository.findAll();
    }

    @Override
    public AutorVO procurarPorID(String id) {
        return autorRepository.findAutorVOById(id);
    }

    @Override
    public void cadastrarAutor(AutorVO vo) {
        autorRepository.save(vo);
    }

}
