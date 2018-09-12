package br.com.db1.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class DAO {

	private EntityManagerFactory emf;


	public EntityManager getEntityManager() {
		return emf.createEntityManager();
	}

	public DAO() {
		emf = Persistence.createEntityManagerFactory("config-entidades");
	}
}
