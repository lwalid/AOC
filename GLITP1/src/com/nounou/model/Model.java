package com.nounou.model;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.TreeSet;



public class Model  {
	private float max;
	private ArrayList<IItem> items;
	
	public Model(){
		items=new ArrayList<IItem>();
		max=0;
	}
	
	public void add(IItem it){
		items.add(it);
		max+=it.getValeur();
	}
	
	public void remove(IItem it){
		items.remove(it);
		max-=it.getValeur();
	}

	public float getMax() {
		return max;
	}
	
 public IItem get_item(int i){
	 
	 return items.get(i);
 }

	public void setMax(float max) {
		this.max = max;
	}


	public ArrayList<IItem> getItems() {
		return items;
	}

	public void setItems(ArrayList<IItem> items) {
		this.items = items;
	}
		
	
}
