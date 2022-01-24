package com.ditto.lojagames.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;



@Entity    						
@Table(name="tb_categoria")     
public class Categoria {
	
	@OneToMany
	@JsonIgnoreProperties("categoria")
	private List<Produto> produto;
	
	@Id							
	@GeneratedValue(strategy = GenerationType.IDENTITY)		
	private long id;
	
	@NotBlank (message = "O atributo nome é obrigatório e não aceita espaços vazios como resposta")
	@Size(min= 3, max = 30, message = "O atributo nome aceita entre 3 a 30 caracteres")
	private String nome;
	
	private String descricao;

	
	
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public List<Produto> getProduto() {
		return produto;
	}

	public void setProduto(List<Produto> produto) {
		this.produto = produto;
	}
	
	
}
