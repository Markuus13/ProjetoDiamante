package br.com.projetodiamante.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.projetodiamante.model.Produto;

@Repository
public interface ProdutoRepository extends CrudRepository<Produto, Long> {

}
