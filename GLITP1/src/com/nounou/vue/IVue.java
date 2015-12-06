package com.nounou.vue;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTable;
import javax.swing.JTextField;

import com.nounou.model.IModel;

public interface IVue {
	
	public IModel getModel();
	public Camembert getCcamembert();
	public JFrame getFrame();
	public JButton getSuivant();
	public JButton getPrecedent();
	public JButton getAjouter();
	public JTable getTable();
	public JTextField getTitre() ;
	public void setTitre(JTextField titre);
	public  JTextField getValeur();
	 public JTextField getDescription() ;
	 



}
