package com.nounou.cammand;

public class ConcreteCommande implements Commande{
	
	Recepteur recp;
	
	public ConcreteCommande( Recepteur recp) {
		// TODO Auto-generated constructor stub
		this.recp=recp;
	}

	
	public void executer() {
		// TODO Auto-generated method stub
		recp.designer();
		
	}
	
	

}
