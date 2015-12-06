package coim.nounou.mvc;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Controleur implements ActionListener{
	Model model;
	Vue vue;
	
	public Controleur(Model m, Vue v) {
		model=m;
		vue=v;
		vue.getBouton().addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		model.setMessage(vue.getTexte().getText());
		vue.getLabel().setText(model.getMessage());
		
	}
	
	
}
