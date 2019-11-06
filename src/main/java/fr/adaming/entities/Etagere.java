package fr.adaming.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tb_etagere")

public class Etagere {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_etagere")
	private long idE;
	private int capacite;

	public Etagere() {
		super();
	}

	// getters et setters
	public long getIdE() {
		return idE;
	}

	public void setIdE(long idE) {
		this.idE = idE;
	}

	public int getCapacite() {
		return capacite;
	}

	public void setCapacite(int capacite) {
		this.capacite = capacite;
	}

	// tostring
	@Override
	public String toString() {
		return "Etagère [id=" + idE + ", capacite=" + capacite + "]";
	}

}