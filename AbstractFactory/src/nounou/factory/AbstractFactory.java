package nounou.factory;

import nounou.factory.couleur.Couleur;
import nounou.factory.form.Forme;

public abstract class AbstractFactory {

	public abstract Forme getForme(String nom);
	public abstract Couleur getCouleur(String nom);
}
