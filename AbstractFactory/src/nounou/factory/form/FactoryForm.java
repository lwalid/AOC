package nounou.factory.form;

import nounou.factory.AbstractFactory;
import nounou.factory.couleur.Couleur;

public class FactoryForm extends AbstractFactory{

	public Forme getForme(String nom){
		Forme forme=null;
		if(nom.equals("carre")){
			forme=new Carre();
		}
		else if(nom.equals("triangle")){
			forme= new Triangle();
		}

		return forme;
	}


	public Couleur getCouleur(String nom){
		return null;
	}
}
