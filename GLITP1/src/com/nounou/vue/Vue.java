package com.nounou.vue;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Observable;
import java.util.Observer;

import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.AbstractTableModel;
import javax.swing.table.TableModel;

import com.nounou.model.IModel;
import com.nounou.model.Item;

public class Vue extends JFrame implements IVue{

	IModel model;
	Camembert camembert;
	JTable table;
	JFrame frame;
	JButton  precedent, suivant;
	JButton ajouter;
	
	JTextField titre;
	JTextField valeur;
	JTextField description;
	
	JLabel titre1;
	JLabel valeur1;
	JLabel description1;

	public Vue(IModel model,TableModel tablemodel){
		this.model=model;
		frame= new JFrame("vue");

		frame.setBounds(0,0,1200,700);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		camembert= new Camembert(model);
		table = new JTable(tablemodel);
		table.setBackground(Color.CYAN);
		precedent= new JButton(new ImageIcon("droite.png"));
		precedent.setBackground(Color.green);
		precedent.setLocation(50, 0);
		suivant= new JButton(new ImageIcon("gauche.png"));
		suivant.setBackground(Color.green);


		ajouter=new JButton("ajouter");	
		ajouter.setBackground(Color.green);
		
		titre= new JTextField();
		valeur= new JTextField();
		description =new JTextField();
		
		titre1= new JLabel("titre");
		valeur1= new JLabel("valeur");
		description1 =new JLabel("description");
		
		
		JPanel container = new JPanel();
		//container.setLayout(new BoxLayout(container, BoxLayout.LINE_AXIS));
		container.setLayout(new BorderLayout());


		JPanel panel1 = new JPanel();
		panel1.setLayout(new BoxLayout(panel1, BoxLayout.PAGE_AXIS));
		JPanel panel2 = new JPanel();
		panel2.setLayout(new BoxLayout(panel2,BoxLayout.LINE_AXIS));
		JPanel panel3 = new JPanel();
		panel3.setLayout(new BoxLayout(panel3, BoxLayout.PAGE_AXIS));
		JPanel panel4 = new JPanel();
		panel4.setLayout(new BoxLayout(panel4, BoxLayout.LINE_AXIS));
		JPanel panel5 = new JPanel();
		panel5.setLayout( new GridLayout(2, 3));
		panel5.add(titre);
		panel5.add(valeur);
		panel5.add(description);
		panel5.add(titre1);
		panel5.add(valeur1);
		panel5.add(description1);
		
		panel1.add(camembert);
		panel2.add(precedent);
		panel2.add(suivant);
		panel1.add(panel2);
		panel3.add(table);
		panel4.add(ajouter);

		panel3.add(panel5);
		panel3.add(panel4);

		panel3.add(new JScrollPane(table));


		container.add(panel1,BorderLayout.CENTER);
		container.add(panel3,BorderLayout.EAST);


		frame.getContentPane().add(container);

		frame.setVisible(true);
	}



	@Override
	public IModel getModel() {
		// TODO Auto-generated method stub
		return model;
	}

	@Override
	public Camembert getCcamembert() {
		// TODO Auto-generated method stub
		return camembert;
	}

	@Override
	public JFrame getFrame() {
		// TODO Auto-generated method stub
		return frame;
	}

	public Camembert getCamembert() {
		return camembert;
	}

	public void setCamembert(Camembert camembert) {
		this.camembert = camembert;
	}

	public JTable getTable() {
		return table;
	}

	public void setTable(JTable table) {
		this.table = table;
	}

	public JButton getPrecedent() {
		return precedent;
	}

	public void setPrecedent(JButton precedent) {
		this.precedent = precedent;
	}

	public JButton getSuivant() {
		return suivant;
	}

	public void setSuivant(JButton suivant) {
		this.suivant = suivant;
	}

	public JButton getAjouter() {
		return ajouter;
	}

	public void setAjouter(JButton ajouter) {
		this.ajouter = ajouter;
	}



	public JTextField getTitre() {
		return titre;
	}

	public void setTitre(JTextField titre) {
		this.titre = titre;
	}

	public JTextField getValeur() {
		return valeur;
	}

	public void setValeur(JTextField valeur) {
		this.valeur = valeur;
	}

	public JTextField getDescription() {
		return description;
	}

	public void setDescription(JTextField description) {
		this.description = description;
	}

	public JLabel getTitre1() {
		return titre1;
	}

	public void setTitre1(JLabel titre1) {
		this.titre1 = titre1;
	}

	public JLabel getValeur1() {
		return valeur1;
	}

	public void setValeur1(JLabel valeur1) {
		this.valeur1 = valeur1;
	}

	public JLabel getDescription1() {
		return description1;
	}

	public void setDescription1(JLabel description1) {
		this.description1 = description1;
	}

	

}
