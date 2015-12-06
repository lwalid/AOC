package nounou.factory;

import nounou.factory.couleur.FactoryCouleur;
import nounou.factory.form.FactoryForm;

public class Factory {

	public AbstractFactory getFactory(String nom){
		
		AbstractFactory absFac=null;
		if(nom.equals("couleur")){
			absFac= new FactoryCouleur();
		}
		else if(nom.equals("forme")){
			absFac=new FactoryForm();
		}
		return absFac;
	}
}
