package com.projeto.helloBank.daos;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;


import com.projeto.helloBank.models.Conta;

public interface ContaDAO extends CrudRepository<Conta, Integer> {
		
	@Modifying
	@Query("update Conta c set c.saldo = c.saldo + ?1 where c.idConta = ?2")
	void setFixedSaldoFor(Double  valor, Integer id);
	
	
	Conta findByIdConta(Integer id);
	
	@Modifying
	@Query("update Conta c set c.saldo = c.saldo - ?1 where c.idConta = ?2")
	void setFixedSaldo(Double  valor, Integer id);
	
}
