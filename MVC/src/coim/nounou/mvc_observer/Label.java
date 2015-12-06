package coim.nounou.mvc_observer;

import java.util.Observable;
import java.util.Observer;

import javax.swing.JLabel;

public class Label extends JLabel implements Observer {
	
	public Label() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Label(String text) {
		super(text);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void update(Observable o, Object arg) {
		// TODO Auto-generated method stub
		Model model=(Model) o;
		setText(model.getMessage());
	
	}

}
