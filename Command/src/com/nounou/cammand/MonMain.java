package com.nounou.cammand;

public class MonMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Invocateur inv= new Invocateur();
		
		Recepteur rcv= new Triangle();
		ConcreteCommande cmd= new ConcreteCommande(rcv);
		
		inv.setCommande(cmd);
		inv.boutonPresse();
		
		Recepteur rcv2= new Rectangle();
		cmd= new ConcreteCommande(rcv2);
		
		inv.setCommande(cmd);
		inv.boutonPresse();
	}

}
