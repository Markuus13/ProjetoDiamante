package br.com.projetodiamante.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.projetodiamante.model.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {

}
