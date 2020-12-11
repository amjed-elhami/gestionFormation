package com.amjed.formations.entities;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Formation {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idFormation;
	private String titreFormation;
	private String descriptionFormation;
	private Double prixFormation;
	private Date dateAjoutFormation;
	
	public Formation()
	{
		super();
	}

	public Formation(String titreFormation, String descriptionFormation, Double prixFormation,
			Date dateAjoutFormation) {
		super();
		this.titreFormation = titreFormation;
		this.descriptionFormation = descriptionFormation;
		this.prixFormation = prixFormation;
		this.dateAjoutFormation = dateAjoutFormation;
	}

	@Override
	public String toString() {
		return "Formation [idFormation=" + idFormation + ", titreFormation=" + titreFormation
				+ ", descriptionFormation=" + descriptionFormation + ", prixFormation=" + prixFormation
				+ ", dateAjoutFormation=" + dateAjoutFormation + "]";
	}

	public Long getIdFormation() {
		return idFormation;
	}

	public void setIdFormation(Long idFormation) {
		this.idFormation = idFormation;
	}

	public String getTitreFormation() {
		return titreFormation;
	}

	public void setTitreFormation(String titreFormation) {
		this.titreFormation = titreFormation;
	}

	public String getDescriptionFormation() {
		return descriptionFormation;
	}

	public void setDescriptionFormation(String descriptionFormation) {
		this.descriptionFormation = descriptionFormation;
	}

	public Double getPrixFormation() {
		return prixFormation;
	}

	public void setPrixFormation(Double prixFormation) {
		this.prixFormation = prixFormation;
	}

	public Date getDateAjoutFormation() {
		return dateAjoutFormation;
	}

	public void setDateAjoutFormation(Date dateAjoutFormation) {
		this.dateAjoutFormation = dateAjoutFormation;
	}
	
	
	

}
