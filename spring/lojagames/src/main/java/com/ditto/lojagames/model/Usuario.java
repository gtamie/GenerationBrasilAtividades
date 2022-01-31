package com.ditto.lojagames.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name="tb_usuarios")
public class Usuario {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	
	@NotBlank(message = "O atributo nome é obrigatório e não aceita espaço em branco")
	@Size(min = 2, message = "O atributo nome deve ter no mínimo dois caracteres")
	private String nome;
	
	@NotBlank(message = "O atributo usuario é obrigatório e não aceita espaço em branco")
	@Email(message = "O atributo usuario deve ser um email válido")
	private String usuario;
	
	@NotBlank(message = "O atributo senha é obrigatório e não aceita espaço em branco")
	@Size(min = 8, message = "O atributo senha deve ter no mínimo oito caracteres")
	private String senha;
	
	/*@NotBlank(message = "O atributo idade é obrigatório e não aceita espaço em branco")
	@Size(max = 3, message = "O atributo idade deve ter no mínimo três caracteres")
	private int idade;*/
	
	@NotBlank(message = "O atributo endereco é obrigatório e não aceita espaço em branco")
	@Size(min = 5, message = "O atributo endereco deve ter no mínimo cinco caracteres")
	private String endereco;
	
	@OneToMany(mappedBy = "usuario", cascade = CascadeType.REMOVE)
	@JsonIgnoreProperties("usuario")
	private List <Produto> produto;

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

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}
	

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public List<Produto> getProduto() {
		return produto;
	}

	public void setProduto(List<Produto> produto) {
		this.produto = produto;
	}
	
	
	

}
