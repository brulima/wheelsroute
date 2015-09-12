package br.com.fiap.wheelsroute.dao.impl;

import javax.persistence.EntityManager;

import br.com.fiap.wheelsroute.dao.LogradouroDAO;
import br.com.fiap.wheelsroute.entity.Logradouro;

public class LogradouroDAOImpl extends DAOImpl<Logradouro,Integer> implements LogradouroDAO{

	public LogradouroDAOImpl(EntityManager em) {
		super(em);
	}

}
