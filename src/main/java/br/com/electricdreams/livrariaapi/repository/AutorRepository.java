package br.com.electricdreams.livrariaapi.repository;

import br.com.electricdreams.livrariaapi.model.AutorVO;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.Repository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

public interface AutorRepository extends MongoRepository<AutorVO,String> {
    List<AutorVO> findAll();
    AutorVO findAutorVOById(String id);

}
