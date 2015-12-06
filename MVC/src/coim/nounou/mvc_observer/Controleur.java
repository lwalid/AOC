package coim.nounou.mvc_observer;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Controleur implements ActionListener {

	Model model;
	Vue vue;
	public Controleur(Model model, Vue vue) {
		super();
		this.model = model;
		this.vue = vue;
		vue.getBouton().addActionListener(this);
	}
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		model.setMessage(vue.getTexte().getText());
		
	}


	public Model getModel() {
		return model;
	}
	public void setModel(Model model) {
		this.model = model;
	}
	public Vue getVue() {
		return vue;
	}
	public void setVue(Vue vue) {
		this.vue = vue;
	}
	
}
