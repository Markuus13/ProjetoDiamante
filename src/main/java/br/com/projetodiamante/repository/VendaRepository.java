package br.com.projetodiamante.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.projetodiamante.model.Venda;

public interface VendaRepository extends JpaRepository<Venda, Long> {

}
