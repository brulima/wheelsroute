package br.com.fiap.wheelsroute.dao.impl;

import javax.persistence.EntityManager;

import br.com.fiap.wheelsroute.dao.TipoLogradouroDAO;
import br.com.fiap.wheelsroute.entity.TipoLogradouro;

public class TipoLogradouroDAOImpl extends DAOImpl<TipoLogradouro, Integer> implements TipoLogradouroDAO{

	public TipoLogradouroDAOImpl(EntityManager em) {
		super(em);
		// TODO Auto-generated constructor stub
	}

}
