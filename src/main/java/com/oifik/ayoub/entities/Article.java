package com.oifik.ayoub.entities;

import java.util.Date;

import jakarta.persistence.*;

@Entity
public class Article {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private String nom;
	private Date dateProduction;
	
	 @ManyToOne
	 private Categorie categorie;

	
	public Article() {
	}


	public long getId() {
		return id;
	}


	public void setId(long id) {
		this.id = id;
	}


	public String getNom() {
		return nom;
	}


	public void setNom(String nom) {
		this.nom = nom;
	}


	public Date getDateProduction() {
		return dateProduction;
	}


	public void setDateProduction(Date dateProduction) {
		this.dateProduction = dateProduction;
	}


	public Categorie getCategorie() {
		return categorie;
	}


	public void setCategorie(Categorie categorie) {
		this.categorie = categorie;
	}
	
	 
	
	
	
}
