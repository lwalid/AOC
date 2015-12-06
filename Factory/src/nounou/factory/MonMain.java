package nounou.factory;

import java.util.Scanner;

public class MonMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		FactoryForm factory= new FactoryForm();
		Scanner input = new Scanner(System.in);
		System.out.println("entrer la forme a dissigner : carre ou triangle :");
		String nom=input.next();
		Forme forme=factory.getForme(nom);
		if(forme !=null){
			forme.affiche();
		}
		else{
			System.out.println("erreur de choix :il fallait choisir entre  : carre ou triangle :");
			
		}
	}

}
