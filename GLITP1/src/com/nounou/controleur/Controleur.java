package com.nounou.controleur;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.geom.Arc2D;
import java.awt.geom.Point2D;
import java.util.ArrayList;

import javax.swing.GrayFilter;

import com.nounou.model.IModel;
import com.nounou.vue.IVue;

public class Controleur implements MouseListener{

	IVue vue;
	IModel model;

	public Controleur(IVue vue,IModel model){
		this.vue=vue;
		this.model=model;
		vue.getCcamembert().addMouseListener(this);	
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		Point2D point= e.getPoint();	
		int i=getArcClicked(point);
		vue.getCcamembert().repaint();

	}


public int getArcClicked(Point2D point){
	ArrayList<Arc2D.Float> arcs=vue.getCcamembert().getArcs();
	for(int i=0;i<arcs.size();i++){
		if((arcs.get(i).contains(point))&& ( vue.getCcamembert().getCercleblanche().contains(point)==false)){
			vue.getCcamembert().setIndice(i);
			System.out.println("clique dans arc "+vue.getCcamembert().getIndice());

			return i;
		}	
	}
	vue.getCcamembert().setIndice(-1);
	return -1;
}

@Override
public void mouseEntered(MouseEvent e) {
	// TODO Auto-generated method stub

}

@Override
public void mouseExited(MouseEvent e) {
	// TODO Auto-generated method stub

}

@Override
public void mousePressed(MouseEvent e) {
	// TODO Auto-generated method stub

}

@Override
public void mouseReleased(MouseEvent e) {
	// TODO Auto-generated method stub

}



}
