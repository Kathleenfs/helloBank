package com.projeto.helloBank.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "contas")
public class Conta {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idconta")
	private Integer idConta;
	
	
	@Column(name = "numero_conta", nullable = false, length = 9, unique = true)
	private int numeroConta;
	
	@Column(name = "agencia", nullable = false, length = 4)
	private int agencia;
	
	@Column(name = "saldo", nullable = true)
	private Double saldo;
	
	@Column(name = "tipo_conta", nullable = false, length = 45)
	private String tipoConta;

	public int getIdConta() {
		return idConta;
	}

	public void setIdConta(int idConta) {
		this.idConta = idConta;
	}

	public int getNumeroConta() {
		return numeroConta;
	}

	public void setNumeroConta(int numeroConta) {
		this.numeroConta = numeroConta;
	}

	public int getAgencia() {
		return agencia;
	}

	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}

	public Double getSaldo() {
		return saldo;
	}

	public void setSaldo(Double saldo) {
		this.saldo = saldo;
	}

	public String getTipoConta() {
		return tipoConta;
	}

	public void setTipoConta(String tipoConta) {
		this.tipoConta = tipoConta;
	}

	public Conta(int idConta, int numeroConta, int agencia, Double saldo, String tipoConta) {
		super();
		this.idConta = idConta;
		this.numeroConta = numeroConta;
		this.agencia = agencia;
		this.saldo = saldo;
		this.tipoConta = tipoConta;
	}
	
	public Conta() {
		
	}
	
}
