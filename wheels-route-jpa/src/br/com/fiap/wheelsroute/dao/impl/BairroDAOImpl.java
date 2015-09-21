package br.com.fiap.wheelsroute.dao.impl;

import javax.persistence.EntityManager;

import br.com.fiap.wheelsroute.dao.BairroDAO;
import br.com.fiap.wheelsroute.entity.Bairro;



public class BairroDAOImpl extends DAOImpl<Bairro, Integer> implements BairroDAO{

	public BairroDAOImpl(EntityManager em) {
		super(em);
		// TODO Auto-generated constructor stub
	}

}
