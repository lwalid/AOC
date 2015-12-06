package coim.nounou.mvc_observer;

public class MonMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vue vue= new Vue();
		vue.init();
		Model model=new Model();
		model.addObserver(vue.getLabel1());
		model.addObserver(vue.getLabel2());
		model.addObserver(vue.getLabel3());
		Controleur controleur= new Controleur(model, vue);
			
		
	}

}
