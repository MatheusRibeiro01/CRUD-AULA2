package com.stefanini.dao;


import javax.inject.Inject;
import javax.persistence.EntityManager;

import com.stefanini.dao.abstracao.GenericDao;
import com.stefanini.model.Pessoa;

/**
 * O Unico objetivo da Dao 
 * @author joaopedromilhome
 *
 */
public class PessoaDao extends GenericDao<Pessoa, Long> {

	@Inject
	private EntityManager em;
	
	public PessoaDao() {
		super(Pessoa.class);
	}

	public Pessoa buscaPorId(Long id) {
		return em.find(Pessoa.class, id);
		
	}
	

}


