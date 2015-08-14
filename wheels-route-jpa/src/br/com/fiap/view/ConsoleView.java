package br.com.fiap.view;

import javax.persistence.EntityManager;

import br.com.fiap.dao.CidadeDAO;
import br.com.fiap.dao.EstadoDAO;
import br.com.fiap.dao.FuncionarioDAO;
import br.com.fiap.dao.impl.CidadeDAOImpl;
import br.com.fiap.dao.impl.EstadoDAOImpl;
import br.com.fiap.dao.impl.FuncionarioDAOImpl;
import br.com.fiap.entity.Cidade;
import br.com.fiap.entity.CidadePK;
import br.com.fiap.entity.Estado;
import br.com.fiap.entity.Funcionario;
import br.com.fiap.exceptions.DBCommitException;
import br.com.fiap.singleton.EMFactorySingleton;

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
		estado.setHabitantes(1000000);
		
		Cidade cidade = new Cidade();
		cidade.setEstado(estado);
		cidade.setNome("Londrina");
		cidade.setHabitantes(350000);
		
		try {
			estDao.insert(estado);
			cidDao.insert(cidade);
		} catch (DBCommitException e) {
			e.printStackTrace();
		}
		
		//Buscar uma cidade...
		CidadePK pk = new CidadePK();
		pk.setNome("Londrina");
		pk.setEstado("PR");
		Cidade cid = cidDao.findById(pk);
		//cidDao.delete(pk);

		System.out.println(cid.getNome());
		System.out.println(cid.getHabitantes());
		
		//Exemplo Multiplas Tabelas
		FuncionarioDAO funcDao = new FuncionarioDAOImpl(em);
		Funcionario func = 
				new Funcionario("Gabriela",2500,"Analista Jr",0);

		try {
			funcDao.insert(func);
		} catch (DBCommitException e) {
			e.printStackTrace();
		}
		
	}
	
}
