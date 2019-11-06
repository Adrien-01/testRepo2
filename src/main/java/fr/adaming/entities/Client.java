package fr.adaming.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity // annotation pour avoir une entité persistante
@Table(name = "tb_client")

public class Client {
	
	@Id // mettre sur le getter concerné pour plus de visibilité 
	@GeneratedValue (strategy = GenerationType.IDENTITY) //autoincrementation
	@Column(name="id_Client")
	private long idClient;
	private String nom;
	private String prenom;
	private String numero;
	
	



	public Client() {
		super();
	}


	public long getIdClient() {
		return idClient;
	}


	public void setIdClient(long idClient) {
		this.idClient = idClient;
	}


	public String getNom() {
		return nom;
	}


	public void setNom(String nom) {
		this.nom = nom;
	}


	public String getPrenom() {
		return prenom;
	}


	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}


	public String getNumero() {
		return numero;
	}


	public void setNumero(String numero) {
		this.numero = numero;
	}
	
	
	

}
