package coim.nounou.mvc_observer;

import java.util.Observable;

public class Model extends Observable {

	String message;

	public String getMessage() {
		return message;
		
	}

	public void setMessage(String message) {
		this.message = message;
		setChanged();
		notifyObservers();
	}
	
	
}
