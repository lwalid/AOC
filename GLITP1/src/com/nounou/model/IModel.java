package com.nounou.model;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

public interface IModel {
	
	public void ajouter(IItem it);
	public void supprimer(IItem it);
	public float getMax();
	public int  nombreItem();
	public IItem getItem(int n);
	public ArrayList<IItem> touLesItems();
	public void setItems(ArrayList<IItem> items);
	public void changerItemTitre(int n,String titre ) ;
	public void changerItemValeur(int n,float valeur );
	public void changerItemDescription(int n,String description) ;
}
