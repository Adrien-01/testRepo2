package fr.adaming.util;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

//cette classe � pour objectif de cr�er les instances automatiquement 
public class HibernateUtil {

	private static final SessionFactory sessionFactory = buildSassionFactory();

	@SuppressWarnings("deprecation")
	private static SessionFactory buildSassionFactory() {

		try {
			// cr�ation du Sessionfactory
			return new Configuration().configure().buildSessionFactory();

		} catch (Throwable ex) {
			System.err.println("Erreur d'initialisation de session factory" + ex);
			throw new ExceptionInInitializerError(ex);
		}

	}

	public static SessionFactory getSessionFactory() {

		return sessionFactory;
	}

	public static void shutdown() { //permet d'ouvrir et fermer la connexion

		getSessionFactory().close();
	}

}