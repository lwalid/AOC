package nounou.factory;

public class FactoryForm {

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
}
