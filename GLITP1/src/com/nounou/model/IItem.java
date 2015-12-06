package com.nounou.model;

import java.awt.Color;

public interface IItem {

	public String getTitre();
	public String getDesciption();
	public float getValeur();
	public void setTitre(String titre);
	public void setValeur(float valeur);
	public void setDesciption(String desciption);
	
}
