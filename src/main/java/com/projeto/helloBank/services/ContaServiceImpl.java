package com.projeto.helloBank.services;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.projeto.helloBank.daos.ContaDAO;
import com.projeto.helloBank.models.Conta;

@Service
public class ContaServiceImpl implements IContaService {

	@Autowired
	private ContaDAO dao;

	@Override
	public Conta criarNovo(Conta novo) {
		if (novo.getTipoConta() != null) {
			return dao.save(novo);
		}
		return null;
	}

	@Override
	public Conta atualizarDados(Conta dados) {
		if (dados.getTipoConta() != null) {
			return dao.save(dados);
		}
		return null;
	}

	@Override
	public ArrayList<Conta> buscarTodos() {
		return (ArrayList<Conta>) dao.findAll();
	}

	@Override
	public Conta buscarPeloId(Integer id) {
		return dao.findById(id).orElse(null);
	}

	@Override
	public void excluirConta(Integer id) {
		dao.deleteById(id);

	}

}
