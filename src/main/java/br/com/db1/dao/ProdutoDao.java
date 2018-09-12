package br.com.db1.dao;

import java.util.List;

import javax.persistence.EntityManager;

import br.com.db1.model.Produto;

public class ProdutoDao extends DAO {
	public void save(Produto produto) {
		EntityManager manager = getEntityManager();

		manager.getTransaction().begin();
		manager.persist(produto);
		manager.getTransaction().commit();
	}

	public List<Produto> list() {
		EntityManager manager = getEntityManager();

		return manager.createQuery("from Produto").getResultList();
	}

}
