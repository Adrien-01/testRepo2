package fr.adaming.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity // annotation pour avoir une entité persistante
@Table(name = "tb_Reservation")
public class Reservation {
	
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	@Column(name="id_reservation")
	private long idRes;
	private String date;
	//Fait le lien entre la classe reservation et client 
	@ManyToOne
	@JoinColumn (name="Identifiant_Client")
	private Client client;
	@ManyToOne
	@JoinColumn (name="Identifiant_Livre")
	private Livre livre;
	

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	public Livre getLivre() {
		return livre;
	}

	public void setLivre(Livre livre) {
		this.livre = livre;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public Reservation() {
		super();
	}

	public long getIdRes() {
		return idRes;
	}

	public void setIdRes(long idRes) {
		this.idRes = idRes;
	}

	
	

}
