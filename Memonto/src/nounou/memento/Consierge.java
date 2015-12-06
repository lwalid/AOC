package nounou.memento;

import java.util.ArrayList;

public class Consierge {

	private ArrayList<Memonto> list= new ArrayList<Memonto>();
	
	public void addMemento(Memonto memento){
		list.add(memento);
		}
	
	public Memonto getMemento(int index){
		return list.get(index);
	}
	
}
