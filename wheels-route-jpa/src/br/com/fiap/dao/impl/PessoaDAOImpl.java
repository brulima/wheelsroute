package br.com.fiap.dao.impl;

import javax.persistence.EntityManager;

import br.com.fiap.dao.PessoaDAO;
import br.com.fiap.entity.Pessoa;

public class PessoaDAOImpl extends DAOImpl<Pessoa, Long> 
										implements PessoaDAO{

	public PessoaDAOImpl(EntityManager em) {
		super(em);
	}

}