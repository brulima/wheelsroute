package br.com.fiap.wheelsroute.dao.impl;

import javax.persistence.EntityManager;

import br.com.fiap.wheelsroute.dao.TipoRootieDAO;
import br.com.fiap.wheelsroute.entity.TipoRootie;

public class TipoRootieDAOImpl extends DAOImpl<TipoRootie, Integer> implements TipoRootieDAO{

	public TipoRootieDAOImpl(EntityManager em) {
		super(em);
		// TODO Auto-generated constructor stub
	}

}
