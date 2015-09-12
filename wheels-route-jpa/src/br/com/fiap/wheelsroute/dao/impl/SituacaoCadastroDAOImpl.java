package br.com.fiap.wheelsroute.dao.impl;

import javax.persistence.EntityManager;

import br.com.fiap.wheelsroute.dao.SituacaoCadastroDAO;
import br.com.fiap.wheelsroute.entity.SituacaoCadastro;

public class SituacaoCadastroDAOImpl extends DAOImpl<SituacaoCadastro, Integer> implements SituacaoCadastroDAO{

	public SituacaoCadastroDAOImpl(EntityManager em) {
		super(em);
		// TODO Auto-generated constructor stub
	}

}
