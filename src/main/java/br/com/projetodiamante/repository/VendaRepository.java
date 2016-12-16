package br.com.projetodiamante.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.projetodiamante.model.Venda;

@Repository
public interface VendaRepository extends CrudRepository<Venda, Long> {

}
