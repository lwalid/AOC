package coim.nounou.mvc;

public class MonMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vue vu= new Vue();
		vu.init();
		Model m= new Model();		
		Controleur con = new Controleur(m, vu);
		

	}

}
