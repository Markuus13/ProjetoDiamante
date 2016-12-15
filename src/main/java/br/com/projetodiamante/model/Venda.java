package br.com.projetodiamante.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;

@Entity
public class Venda implements Serializable {
	private static final long serialVersionUID = 1306575827084806412L;
	private Long id;
	private Cliente cliente;
	private List<Produto> produtos;

	@Id
	@GeneratedValue(generator = "Venda.id", strategy = GenerationType.SEQUENCE)
	@SequenceGenerator(name = "Venda.id", sequenceName = "venda_sequence", allocationSize = 1)
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	@ManyToOne
	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	@ManyToMany
	public List<Produto> getProdutos() {
		return produtos;
	}

	public void setProdutos(List<Produto> produtos) {
		this.produtos = produtos;
	}
}
