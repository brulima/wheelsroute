package br.com.fiap.dao.impl;

import javax.persistence.EntityManager;

import br.com.fiap.entity.Cidade;
import br.com.fiap.entity.CidadePK;
import br.com.fiap.dao.CidadeDAO;

public class CidadeDAOImpl extends DAOImpl<Cidade, CidadePK>
											implements CidadeDAO{

	public CidadeDAOImpl(EntityManager em) {
		super(em);
	}

}
