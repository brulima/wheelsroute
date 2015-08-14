package br.com.fiap.dao.impl;

import javax.persistence.EntityManager;

import br.com.fiap.entity.Animal;
import br.com.fiap.dao.AnimalDAO;

public class AnimalDAOImpl extends DAOImpl<Animal, Integer>
											implements AnimalDAO{

	public AnimalDAOImpl(EntityManager em) {
		super(em);
	}

}
