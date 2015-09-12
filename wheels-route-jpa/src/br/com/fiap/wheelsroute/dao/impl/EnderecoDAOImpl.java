package br.com.fiap.wheelsroute.dao.impl;

import javax.persistence.EntityManager;

import br.com.fiap.wheelsroute.dao.EnderecoDAO;
import br.com.fiap.wheelsroute.entity.Endereco;

public class EnderecoDAOImpl extends DAOImpl<Endereco, Integer> implements EnderecoDAO{

	public EnderecoDAOImpl(EntityManager em) {
		super(em);
		// TODO Auto-generated constructor stub
	}

}
