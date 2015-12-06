package coim.nounou.mvc_observer;

import java.awt.FlowLayout;
import java.util.Observable;
import java.util.Observer;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Vue {

	private JFrame frame;
	private JTextField texte;
	private JButton bouton;
	private Label label1,label2,label3;


	public Vue(){

	}

	public void init(){
		frame= new JFrame("la vue");
		label1= new Label("label1");
		label2= new Label("label2");
		label3= new Label("label3");
		texte= new JTextField();
		texte.setColumns(15);
		bouton =new JButton("ok");
		frame.setLayout(new FlowLayout());
	
		frame.getContentPane().add(texte);
		frame.getContentPane().add(bouton);
		frame.getContentPane().add(label1);
		frame.getContentPane().add(label2);
		frame.getContentPane().add(label3);
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

	public Label getLabel1() {
		return label1;
	}

	public void setLabel1(Label label1) {
		this.label1 = label1;
	}

	public Label getLabel2() {
		return label2;
	}

	public void setLabel2(Label label2) {
		this.label2 = label2;
	}

	public Label getLabel3() {
		return label3;
	}

	public void setLabel3(Label label3) {
		this.label3 = label3;
	}
	
	

}
