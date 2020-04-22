package br.com.electricdreams.livrariaapi.repository;

import br.com.electricdreams.livrariaapi.model.LivroVO;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface LivroRepository extends MongoRepository<LivroVO,String> {
    List<LivroVO> findAllByAutor(String id);
}
