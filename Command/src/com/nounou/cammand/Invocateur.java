package com.nounou.cammand;

public class Invocateur {

	private Commande cmd;
	
	public void setCommande(Commande cmd){
		this.cmd=cmd;
	}

	public void boutonPresse() {
		cmd.executer();
		}
}
