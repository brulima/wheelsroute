package br.com.fiap.wheelsroute.dao.impl;

import javax.persistence.EntityManager;

import br.com.fiap.wheelsroute.dao.FotoDAO;
import br.com.fiap.wheelsroute.entity.Foto;

public class FotoDAOImpl extends DAOImpl<Foto, Integer> implements FotoDAO{

	public FotoDAOImpl(EntityManager em) {
		super(em);
		// TODO Auto-generated constructor stub
	}

}
