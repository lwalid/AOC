package com.nounou.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Observable;
import java.util.Observer;
import java.util.TreeSet;

public class ModelAdapter extends Observable implements IModel {

	Model model;
	
	public ModelAdapter(Model model) {
		// TODO Auto-generated constructor stub
		this.model=model;
	}

	@Override
	public void ajouter(IItem it) {
		model.add(it);	
		setChanged();
		notifyObservers();
	}

	@Override
	public void supprimer(IItem it) {
		model.remove(it);	
		setChanged();
		notifyObservers();
	}

	
	@Override
	public int nombreItem() {
		// TODO Auto-generated method stub
		return model.getItems().size();
	}

	@Override
	public float getMax() {
		return model.getMax();
	}

	@Override
	public IItem getItem(int n) {
		// TODO Auto-generated method stub
		return model.get_item(n);
	}

	@Override
	public ArrayList<IItem> touLesItems() {
		// TODO Auto-generated method stub
		return model.getItems();
	}
	


	@Override
	public void setItems(ArrayList<IItem> items) {
		// TODO Auto-generated method stub
		model.setItems(items);
	}

	public void changerItemTitre(int n,String titre ) {
		// TODO Auto-generated method stub
		model.get_item(n).setTitre(titre);
		setChanged();
		notifyObservers();
	}
	
	public void changerItemValeur(int i,float valeur ) {
		// TODO Auto-generated method stub
		model.setMax(model.getMax()-model.get_item(i).getValeur()+valeur);
		model.get_item(i).setValeur(valeur);
		setChanged();
		notifyObservers();
	}
	
	public void changerItemDescription(int n,String description) {
		// TODO Auto-generated method stub
		model.get_item(n).setDesciption(description);
		setChanged();
		notifyObservers();
	}
	

}
