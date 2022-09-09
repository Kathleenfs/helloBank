package com.projeto.helloBank.models;


import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "clientes")
public class Cliente {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idcliente")
	private Integer idCliente;
	
	@Column(name = "nome", nullable = false, length = 45)
	private String nome;
	
	@Column(name = "cpf", nullable = false, length = 15, unique= true)
	private String cpf;
	
	@Column(name = "data_nascimento", nullable = false)
	private Date dataNascimento;
	
	@Column(name = "telefone", nullable = false, length = 15)
	private String telefone;
	
	@Column(name = "email", nullable = false, length = 45, unique = true)
	private String email;
	
	@Column(name = "endereco", nullable = false, length = 45)
	private String endereco;

	public int getIdCliente() {
		return idCliente;
	}

	public void setIdCliente(Integer idCliente) {
		this.idCliente = idCliente;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public Date getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public Cliente(int idCliente, String nome, String cpf, Date dataNascimento, String telefone, String email,
			String endereco) {
		super();
		this.idCliente = idCliente;
		this.nome = nome;
		this.cpf = cpf;
		this.dataNascimento = dataNascimento;
		this.telefone = telefone;
		this.email = email;
		this.endereco = endereco;
	}
	
	public Cliente() {
		
	}

}
