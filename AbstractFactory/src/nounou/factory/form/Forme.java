package nounou.factory.form;

public abstract class Forme {

	private int nombreCote;

	public void setNombreCote(int nombreCote) {
		this.nombreCote = nombreCote;
	}
	
	public abstract void affiche();
}
