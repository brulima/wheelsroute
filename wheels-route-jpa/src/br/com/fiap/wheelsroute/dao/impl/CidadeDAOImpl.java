package br.com.fiap.wheelsroute.dao.impl;

import javax.persistence.EntityManager;

import br.com.fiap.wheelsroute.dao.CidadeDAO;
import br.com.fiap.wheelsroute.entity.Cidade;

public class CidadeDAOImpl  extends DAOImpl<Cidade, Integer> implements CidadeDAO{

	public CidadeDAOImpl(EntityManager em) {
		super(em);
	}

}