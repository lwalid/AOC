package com.nounou.controleur;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import com.nounou.model.IModel;
import com.nounou.vue.IVue;

public class ControleurBoutonRotation implements ActionListener{

	IVue vue;
	IModel model;

	public ControleurBoutonRotation(IVue vue,IModel model){
		this.vue=vue;
		this.model=model;
		vue.getSuivant().addActionListener(this);
		vue.getPrecedent().addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		int indice=vue.getCcamembert().indice;
		System.out.println("indice: "+indice);
		String cmd=e.getActionCommand();
		if(e.getSource()==vue.getPrecedent() && indice != -1){//
			vue.getCcamembert().setIndice(Math.abs(((indice-1)+model.nombreItem())%model.nombreItem()));
			vue.getCcamembert().repaint();
		}
		if(e.getSource()==vue.getSuivant() && indice != -1){ // 
			vue.getCcamembert().setIndice(Math.abs(((indice+1)+model.nombreItem())%model.nombreItem()));
			vue.getCcamembert().repaint();
		}
	}

}
