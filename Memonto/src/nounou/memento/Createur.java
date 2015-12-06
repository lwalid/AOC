package nounou.memento;

public class Createur {

	private String article;

	public void SetArticle(String article){
		this.article=article;
	}

	public Memonto storeInMemento(){
		return new Memonto(article);
	}
	
	public void restoreFromMemonto(Memonto memento){
		article=memento.getSavedArticle();
	}

}
