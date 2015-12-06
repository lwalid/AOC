package com.nounou.model;

import java.awt.Color;

public class Item implements IItem {
	
	private String titre;
	private float valeur;
	private String desciption;

	
	
	public Item() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Item(String titre, String desciption, float valeur) {
		super();
		this.titre = titre;
		this.desciption = desciption;
		this.valeur = valeur;
		
	}



	public String getTitre() {
		return titre;
	}

	public void setTitre(String titre) {
		this.titre = titre;
	}

	public String getDesciption() {
		return desciption;
	}

	public void setDesciption(String desciption) {
		this.desciption = desciption;
	}
	

	public float getValeur() {
		return valeur;
	}

	public void setValeur(float valeur) {
		this.valeur = valeur;
	}
	
	
	
}
