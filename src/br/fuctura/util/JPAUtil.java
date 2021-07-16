package br.fuctura.util;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class JPAUtil {

	// SINGLETON
	private static EntityManagerFactory factory;
	static {
	factory = Persistence.createEntityManagerFactory("FucturaPU");
	}
	
	public static EntityManager getEntityManager() {
	return factory.createEntityManager();
	}
	
//	public static void close() {
//	factory.close();
//	}
}