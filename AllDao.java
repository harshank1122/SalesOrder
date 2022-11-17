package org.careerX2.O.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.careerX2.O.dto.CostomerDTO;
import org.careerX2.O.dto.Ordetails;
import org.careerX2.O.dto.SelesReDetails;



public class AllDao {
	
	public EntityManager getEntityManager() {
    	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("Careerx2.0");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
    	return entityManager ;
    			
    }
	
	public void save(SelesReDetails selesReDetails) {
		EntityManager entityManager = getEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		entityTransaction.begin();
		entityManager.persist(selesReDetails); //-- insert data
		entityTransaction.commit();
	}
	
	public void saveor(Ordetails orderdetails) {
		EntityManager entityManager = getEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		entityTransaction.begin();
		entityManager.persist(orderdetails); //-- insert data
		entityTransaction.commit();
	}
	
	public void savecus(CostomerDTO customerdto ) {
		EntityManager entityManager = getEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		entityTransaction.begin();
		entityManager.persist(customerdto); //-- insert data
		entityTransaction.commit();
	}
	

	
	
	public SelesReDetails findById(String id) {
		EntityManager entityManager = getEntityManager();
		SelesReDetails studentDetails = entityManager.find(SelesReDetails.class, id);
		return studentDetails;
	}
	
}
