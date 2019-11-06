package fr.adaming.main;

import org.hibernate.Session;

import fr.adaming.entities.Client;
import fr.adaming.entities.Etagere;
import fr.adaming.entities.Livre;
import fr.adaming.entities.Reservation;
import fr.adaming.util.HibernateUtil;

public class App {

	public static void main(String[] args) {

		Session session = HibernateUtil.getSessionFactory().openSession();

		session.beginTransaction();

		Etagere e1 = new Etagere();
		e1.setCapacite(12);
		session.save(e1);

		Livre l1 = new Livre();

		l1.setTitre("Mon premier livre");
		l1.setAuteur("Balzac");
		l1.setPrix(12);
		l1.setEtagere(e1);

		session.save(l1);

		Livre l2 = new Livre();

		l2.setTitre("Mon second livre livre");
		l2.setAuteur("Hugo");
		l2.setPrix(14);
		l2.setEtagere(e1);

		session.save(l2);

		Client c1 = new Client();

		c1.setNom("Jacques");
		c1.setPrenom("Jean");
		c1.setNumero("25-f");

		session.save(c1);
		
		Client c2 = new Client();

		c2.setNom("Lafontaine");
		c2.setPrenom("Christian");
		c2.setNumero("23-1");

		session.save(c2);


		Reservation r1 = new Reservation();
		r1.setDate("avril");
		r1.setClient(c1);
		r1.setLivre(l1);

		session.save(r1);
		
		Reservation r2 = new Reservation();
		r2.setDate("juin");
		r2.setClient(c1);
		r2.setLivre(l2);

		session.save(r2);
		
		Reservation r3 = new Reservation();
		r3.setDate("mai");
		r3.setClient(c2);
		r3.setLivre(l2);

		session.save(r3);

		session.getTransaction().commit();

	}

}
