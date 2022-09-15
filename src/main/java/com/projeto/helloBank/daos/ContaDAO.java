package com.projeto.helloBank.daos;

import org.springframework.data.repository.CrudRepository;


import com.projeto.helloBank.models.Conta;

public interface ContaDAO extends CrudRepository<Conta, Integer> {

}
