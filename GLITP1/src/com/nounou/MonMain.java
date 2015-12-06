package com.nounou;

import javax.swing.table.TableModel;

import com.nounou.controleur.Controleur;
import com.nounou.controleur.ControleurBoutonRotation;
import com.nounou.controleur.ControleurTable;
import com.nounou.model.Item;
import com.nounou.model.Model;
import com.nounou.model.ModelAdapter;
import com.nounou.vue.TableModele;
import com.nounou.vue.Vue;

public class MonMain {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		

		Item loyer= new Item("loyer", "cher", 120);
		Item mobile= new Item("mobile", "pas cher", 60);
		Item sport= new Item("sport", "pas cher", 60);
		Item nouriture= new Item("nouriture", "pas cher", 60);	
		
		Model model= new Model();	
		
		ModelAdapter modadp=new ModelAdapter(model);
		modadp.ajouter(loyer);
		modadp.ajouter(mobile);
		modadp.ajouter(sport);
		TableModele tablemodel= new TableModele(modadp);
		Vue vu= new Vue(modadp,tablemodel);
		modadp.addObserver(vu.getCcamembert());
				
	
	   Controleur controleur= new Controleur(vu, modadp);
	   ControleurBoutonRotation contBouton=new ControleurBoutonRotation(vu, modadp);
	   ControleurTable contTable= new ControleurTable(vu);

		
		
		
	
	}

}
