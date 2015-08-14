package br.com.fiap.view;

import java.util.Calendar;
import java.util.GregorianCalendar;

import javax.persistence.EntityManager;

import br.com.fiap.dao.AnimalDAO;
import br.com.fiap.dao.PessoaDAO;
import br.com.fiap.dao.impl.AnimalDAOImpl;
import br.com.fiap.dao.impl.PessoaDAOImpl;
import br.com.fiap.entity.Ave;
import br.com.fiap.entity.Cachorro;
import br.com.fiap.entity.PessoJuridica;
import br.com.fiap.entity.Pessoa;
import br.com.fiap.entity.PessoaFisica;
import br.com.fiap.exceptions.DBCommitException;
import br.com.fiap.singleton.EMFactorySingleton;

public class HerancaView {

	
	public static void main(String[] args) {
		//Persistir uma pessoa Juridica
		EntityManager em = EMFactorySingleton.getInstance()
										.createEntityManager();
		
		PessoaDAO dao = new PessoaDAOImpl(em);
		
		PessoJuridica pj = new PessoJuridica();
		pj.setCnpj("21.325.365/0001-05");
		pj.setNacionalidade("Brasileira");
		pj.setNomeFantasia("Nome Fantasia");
		pj.setNome("Java Store");
		
		try {
			dao.insert(pj);
		} catch (DBCommitException e) {
			e.printStackTrace();
		}
		
		//Cadastrar uma Pessoa Fisica
		PessoaFisica pf = new PessoaFisica();
		pf.setNome("Maria");
		pf.setCpf("256.365.326-85");
		pf.setInadimplente(true);
		pf.setDataNascimento(
				new GregorianCalendar(1990,Calendar.SEPTEMBER,15));
		
		try {
			dao.insert(pf);
		} catch (DBCommitException e) {
			e.printStackTrace();
		}
		
		Pessoa p = dao.findById(2l);
		
		if (p instanceof PessoaFisica){
			pf = (PessoaFisica) p;
			System.out.println(pf.getCpf());
		}else{
			pj = (PessoJuridica) p;
			System.out.println(pj.getCnpj());
		}
		
		//Cadastrar um cachorro e uma ave
		AnimalDAO animalDao = new AnimalDAOImpl(em);
		
		Cachorro dog = new Cachorro();
		dog.setCastrado(true);
		dog.setNome("Duke");
		dog.setRaca("Pug");
		
		Ave ave = new Ave();
		ave.setEspecie("Pardal");
		ave.setVoa(true);
		ave.setNome("Pardalzinho");
		
		try {
			animalDao.insert(ave);
			animalDao.insert(dog);
		} catch (DBCommitException e) {
			e.printStackTrace();
		}
		
		
		
	}
	
}
