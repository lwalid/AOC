package nounou.factory;


import nounou.factory.couleur.Couleur;

import nounou.factory.form.Forme;

public class MonMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Factory fac=new Factory();

		AbstractFactory facC=fac.getFactory("couleur");
		AbstractFactory facF=fac.getFactory("forme");

		Couleur bleu=facC.getCouleur("bleu");
		Forme carre=facF.getForme("carre");
		
		bleu.affiche();
		carre.affiche();
	}

}
