package br.com.projetodiamante.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import br.com.projetodiamante.model.Venda;

@Repository
public interface VendaRepository extends JpaRepository<Venda, Long> {

}
