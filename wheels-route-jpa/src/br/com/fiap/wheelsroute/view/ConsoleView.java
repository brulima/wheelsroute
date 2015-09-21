package br.com.fiap.wheelsroute.view;

import javax.persistence.EntityManager;

import br.com.fiap.wheelsroute.dao.CidadeDAO;
import br.com.fiap.wheelsroute.dao.EstadoDAO;
import br.com.fiap.wheelsroute.dao.impl.CidadeDAOImpl;
import br.com.fiap.wheelsroute.dao.impl.EstadoDAOImpl;
import br.com.fiap.wheelsroute.entity.Cidade;
import br.com.fiap.wheelsroute.entity.Estado;
import br.com.fiap.wheelsroute.exception.DBCommitException;
import br.com.fiap.wheelsroute.singleton.EMFactorySingleton;

public class ConsoleView {

	public static void main(String[] args) {
		EntityManager em = EMFactorySingleton
						.getInstance().createEntityManager();
		
		//Cadastrar uma Cidade...
		CidadeDAO cidDao = new CidadeDAOImpl(em);
		EstadoDAO estDao = new EstadoDAOImpl(em);
		
		Estado estado = new Estado();
		estado.setSigla("PR");
		estado.setNome("Paraná");
		
		Cidade cidade = new Cidade();
		cidade.setEstado(estado);
		cidade.setNome("Londrina");
		
		try {
			estDao.insert(estado);
			cidDao.insert(cidade);
		} catch (DBCommitException e) {
			e.printStackTrace();
		}
		
		
	}
	
}
