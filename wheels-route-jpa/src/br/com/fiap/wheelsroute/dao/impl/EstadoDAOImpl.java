package br.com.fiap.wheelsroute.dao.impl;

import javax.persistence.EntityManager;

import br.com.fiap.wheelsroute.dao.EstadoDAO;
import br.com.fiap.wheelsroute.entity.Estado;

public class EstadoDAOImpl extends DAOImpl<Estado,Integer> implements EstadoDAO{

	public EstadoDAOImpl(EntityManager em) {
		super(em);
	}

}
