package coim.nounou.mvc;


import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Vue {

	private JFrame frame;
	private JTextField texte;
	private JButton bouton;
	private JLabel label;


	public Vue(){

	}

	public void init(){
		frame= new JFrame("la vue");
		label= new JLabel("rien");
		texte= new JTextField();
		texte.setColumns(15);
		bouton =new JButton("ok");
		frame.setLayout(new FlowLayout());
	
		frame.getContentPane().add(texte);
		frame.getContentPane().add(bouton);
		frame.getContentPane().add(label);
		frame.pack();
		frame.setVisible(true);
	}

	public JFrame getFrame() {
		return frame;
	}

	public void setFrame(JFrame frame) {
		this.frame = frame;
	}

	public JTextField getTexte() {
		return texte;
	}

	public void setTexte(JTextField texte) {
		this.texte = texte;
	}

	public JButton getBouton() {
		return bouton;
	}

	public void setBouton(JButton bouton) {
		this.bouton = bouton;
	}

	public JLabel getLabel() {
		return label;
	}

	public void setLabel(JLabel label) {
		this.label = label;
	}
	
	
	
}
