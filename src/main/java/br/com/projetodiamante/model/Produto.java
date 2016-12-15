package br.com.projetodiamante.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.SequenceGenerator;

@Entity
public class Produto implements Serializable {
	private static final long serialVersionUID = -5601091794731893340L;
	private Long id;
	private String nome;
	private List<Venda> vendas;

	@Id
	@GeneratedValue(generator = "Produto.id", strategy = GenerationType.SEQUENCE)
	@SequenceGenerator(name = "Produto.id", sequenceName = "produto_sequence", allocationSize = 1)
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	@ManyToMany
	public List<Venda> getVendas() {
		return vendas;
	}

	public void setVendas(List<Venda> vendas) {
		this.vendas = vendas;
	}
}
