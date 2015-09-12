package br.com.fiap.wheelsroute.dao;

import br.com.fiap.wheelsroute.exception.DBCommitException;
import br.com.fiap.wheelsroute.exception.IdNotFoundException;


/**
 * Inteface que define as funcionalidades 
 * genéricas do DAO (CRUD)
 * 
 * @author Thiago 
 *
 * @param <T> - Classe da Entidade
 * @param <K> - Classe do Tipo da chave primária
 */
public interface DAO<T,K> {

	void insert(T entity) throws DBCommitException;
	void update(T entity) throws DBCommitException;
	void delete(K id) throws DBCommitException, 
								IdNotFoundException;
	T findById(K id);
	
}
