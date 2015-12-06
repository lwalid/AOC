package com.nounou.controleur;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import com.nounou.model.Item;
import com.nounou.vue.IVue;
import com.nounou.vue.TableModele;
import com.nounou.vue.Vue;

public class ControleurTable implements ActionListener{

	IVue vue;

	public ControleurTable(IVue vue) {
		super();
		this.vue = vue;
		vue.getAjouter().addActionListener(this );
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		TableModele table=(TableModele) vue.getTable().getModel();
		if(e.getSource()==vue.getAjouter()){
			Item item= new Item(vue.getTitre().getText(),vue.getDescription().getText(),
					Float.parseFloat(vue.getValeur().getText()));
			table.ajouterligne(item);
		}
	
	}

}
