package fr.adaming.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * 
 * @author moi
 *
 */
@Entity // annotation pour avoir une entité persistante
@Table(name = "tb_livre")

public class Livre {

	

	
	@Id // mettre sur le getter concerné pour plus de visibilité 
	@GeneratedValue (strategy = GenerationType.IDENTITY) //autoincrementation
	
	@Column(name="id_livre")// nommé colonne, personnalise dans la table pas obligatoire
	private long id;
	@Column(name="Titre")
	private String titre;
	@Column(name="Auteur")
	private String auteur;
	@Column(name="Prix")
	private double prix;
	@ManyToOne  //lien entre livre et etagere
	private Etagere etagere;
	
	 // creation d'un objet etagere (represente
								// l'association unidirectionnelle entre etagere
								// et livres)



	public Livre() {
		super();
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}



	public String getTitre() {
		return titre;
	}

	public void setTitre(String titre) {
		this.titre = titre;
	}

	public String getAuteur() {
		return auteur;
	}

	public void setAuteur(String auteur) {
		this.auteur = auteur;
	}

	public double getPrix() {
		return prix;
	}

	public void setPrix(double prix) {
		this.prix = prix;
	}

	public Etagere getEtagere() {
		return etagere;
	}

	public void setEtagere(Etagere etagere) {
		this.etagere = etagere;
	}

	@Override
	public String toString() {
		return "Livre [id=" + id + ", titre=" + titre + ", auteur=" + auteur + ", prix=" + prix + "]";
	}


	

}
