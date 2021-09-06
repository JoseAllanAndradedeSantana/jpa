package model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tb_produtos")
public class Produto {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column(name = "codigoDeBarras", length = 15, nullable = false)
	private Long codigoDeBarras;
	private String nome;
	@Column(name = "preco",nullable = false, precision = 10, scale = 2)
	private Double preco;
	private int quantidade;
	
	
	public Produto() {
		super();
	}


	public Produto(Long codigoDeBarras, String nome, Double preco, int quantidade) {
		super();
		this.codigoDeBarras = codigoDeBarras;
		this.nome = nome;
		this.preco = preco;
		this.quantidade = quantidade;
	}


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public Long getCodigoDeBarras() {
		return codigoDeBarras;
	}


	public void setCodigoDeBarras(Long codigoDeBarras) {
		this.codigoDeBarras = codigoDeBarras;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public Double getPreco() {
		return preco;
	}


	public void setPreco(Double preco) {
		this.preco = preco;
	}


	public int getQuantidade() {
		return quantidade;
	}


	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	
	
	

}
