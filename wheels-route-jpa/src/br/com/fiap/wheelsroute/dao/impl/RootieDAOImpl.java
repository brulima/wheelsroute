package br.com.fiap.wheelsroute.dao.impl;

import javax.persistence.EntityManager;

import br.com.fiap.wheelsroute.dao.RootieDAO;
import br.com.fiap.wheelsroute.entity.Rootie;

public class RootieDAOImpl extends DAOImpl<Rootie, Integer> implements RootieDAO{

	public RootieDAOImpl(EntityManager em) {
		super(em);
		
	}

}
