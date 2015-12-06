package com.nounou.vue;

import java.awt.Color;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.Rectangle;
import java.awt.geom.Arc2D;
import java.awt.geom.Point2D;
import java.awt.geom.Rectangle2D;
import java.util.ArrayList;
import java.util.Observable;
import java.util.Observer;
import java.util.Random;

import javax.swing.JComponent;


import com.nounou.model.IModel;

public class Camembert extends  JComponent  implements Observer{

	Graphics2D g2d;	
	IModel  model;
	ArrayList<Arc2D.Float> arcs;
	Arc2D.Float cercleblanche;
	Arc2D.Float cerclebleu;
	ArrayList<Rectangle2D> rectangles;
	ArrayList<Color> couleurs;
	Font font = new Font("Serif", Font.ITALIC,16);
	// parametre de la frame 
	int x,y;
	int largeur;
	int hauteur;
	//donne l'indice du arc cliqué
	public static int indice;


	public Camembert(IModel im) {
		model = im;
		init();
	}

	public void prepationCouleurs(){
		Random rand= new Random();
		for(int i=0;i<model.nombreItem();i++){
			this.couleurs.set(i,new Color(rand.nextInt(256),rand.nextInt(256),rand.nextInt(256)));
		}
	}

	public void preparationArcs(){
		float anglestart=0;
		Arc2D.Float arc;
		for(int i=0;i<model.nombreItem();i++){
			arc= new Arc2D.Float(Arc2D.PIE);
			if(i==indice){
				arc.setFrame(x-30, y-30, largeur+60, hauteur+60);
			}
			else{
				arc.setFrame(x, y, largeur, hauteur);
			}
			float angle=(model.getItem(i).getValeur()*360)/model.getMax();
			arc.setAngleStart(anglestart);
			arc.setAngleExtent(angle);
			arcs.set(i, arc);
			anglestart+=angle;
		}
	}

	public void init(){
		x=200;y=110;
		largeur=400;hauteur=400;
		cercleblanche=new Arc2D.Float(Arc2D.PIE);;
		cerclebleu=new Arc2D.Float(Arc2D.PIE);
		arcs=new ArrayList<Arc2D.Float> (model.nombreItem());	
		couleurs= new ArrayList<Color>(model.nombreItem());
		for(int i=0;i<model.nombreItem();i++){
			arcs.add(new Arc2D.Float());
			couleurs.add(new Color(i));
		}
		prepationCouleurs();
		indice=-1;
	}

	public void dessinerArc(int i){
		g2d.setColor(couleurs.get(i));
		g2d.fill(arcs.get(i));	
	}

	public void dessinerLesArcs(Graphics2D g2d){
		for(int i=0;i<model.nombreItem();i++){
			dessinerArc(i);
		}		
	}

	public void dessinerCercleBlache(){
		cercleblanche.setFrame(x+100, y+100, largeur-2*100,hauteur-2*100);	
		cercleblanche.setAngleStart(0);
		cercleblanche.setAngleExtent(360);			
		g2d.setColor(Color.red);
		g2d.draw(cercleblanche);
		g2d.setColor(Color.white);
		g2d.fill(cercleblanche);
	}

	public void dessinerCercleBleu(){
		cerclebleu.setFrame(cercleblanche.getX()+50, cercleblanche.getY()+50, cercleblanche.getWidth()-2*50,cercleblanche.getHeight()-2*50);	
		cerclebleu.setAngleStart(0);
		cerclebleu.setAngleExtent(360);			
		g2d.setColor(Color.red);
		g2d.draw(cerclebleu);
		g2d.setColor(Color.blue);
		g2d.fill(cerclebleu);

	}

	public void dessinerChaine(){
		g2d.setColor(Color.black);
		g2d.setFont(font);
		g2d.drawString("Budget",(int)(cerclebleu.getX()+(cerclebleu.getWidth()/3)),(int)(cerclebleu.getY()+(cerclebleu.getHeight()/2)));     
		g2d.drawString(""+model.getMax(),(int)(cerclebleu.getX()+(cerclebleu.getWidth()/3)),(int)(cerclebleu.getY()+(cerclebleu.getHeight()/2)+30));

	}

	public Point2D pointMilieuArc(Arc2D.Float arc){
		Arc2D.Float angle=new Arc2D.Float(Arc2D.PIE);
		angle.setFrame(x, y, largeur, hauteur);
		angle.setAngleStart(0);
		angle.setAngleExtent((arc.getAngleExtent()/2)+arc.getAngleStart());
		Point2D res= angle.getEndPoint();
		return res;
	}
	// dessigner une chaine de caractere dans un rectanle

	public void render(Graphics g, String s, int x, int y,Color couleur) {
		g.setFont(font);  
		FontMetrics fm = g.getFontMetrics();
		Rectangle r = fm.getStringBounds(s, g).getBounds();
		g.setColor(couleur);
		g.fillRect(r.x + x, r.y + y, r.width, r.height);
		g.setColor(Color.black);
		g.drawString(s, (int)x,(int) y);
	}

	public Point2D.Float localiserTeteRectangle(Point2D pointmilieu,int l,int h){

		Point2D.Float res= new Point2D.Float();

		Arc2D.Float angle1=new Arc2D.Float(Arc2D.PIE);
		Arc2D.Float angle2=new Arc2D.Float(Arc2D.PIE);
		Arc2D.Float angle3=new Arc2D.Float(Arc2D.PIE);
		Arc2D.Float angle4=new Arc2D.Float(Arc2D.PIE);

		angle1.setFrame(x-10, y-10, largeur+50,+50);
		angle1.setAngleStart(0);
		angle1.setAngleExtent(90);

		angle2.setFrame(x-10, y-10, largeur+50, hauteur+50);
		angle2.setAngleStart(90);
		angle2.setAngleExtent(90);

		angle3.setFrame(x-10, y-10, largeur+50, hauteur+50);
		angle3.setAngleStart(180);
		angle3.setAngleExtent(90);

		angle4.setFrame(x-10, y-10, largeur+50, hauteur+50);
		angle4.setAngleStart(270);
		angle4.setAngleExtent(90);

		if(angle1.contains(pointmilieu)){
			res.setLocation(l+pointmilieu.getX(), pointmilieu.getY()-2*h);		
		}
		else if(angle2.contains(pointmilieu)){
			res.setLocation(pointmilieu.getX()-3*l, pointmilieu.getY()-h);		
		}
		else if(angle3.contains(pointmilieu)){
			res.setLocation(pointmilieu.getX()-2*l, pointmilieu.getY()+h);
		}
		else {
			res.setLocation(pointmilieu.getX()+l, pointmilieu.getY());
		}
		return res;
	}

	public void dessinerLesRectangles(Graphics2D g2d){
		for(int i=0;i<model.nombreItem();i++){
			Point2D pointmilieu= pointMilieuArc(arcs.get(i));
			Point2D.Float tete=localiserTeteRectangle(pointmilieu, 50, 50);
			if(indice==i){
				render(g2d, model.getItem(i).getTitre(),(int) tete.x, (int)tete.y,couleurs.get(i));
				render(g2d, model.getItem(i).getDesciption(),(int) tete.x, (int)tete.y+20,couleurs.get(i));
				render(g2d, ""+model.getItem(i).getValeur(),(int) tete.x, (int)tete.y+40,couleurs.get(i));	
			}
			else{
				render(g2d, model.getItem(i).getTitre(),(int) tete.x, (int)tete.y,couleurs.get(i));
			}
			
		}
	}


	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		System.out.println("repaint");
		g2d=(Graphics2D) g;
		preparationArcs();
		dessinerLesArcs(g2d);
		dessinerCercleBlache();
		dessinerCercleBleu();
		g2d.setColor(Color.black);
		g2d.setFont(font);
		g2d.drawString("Budget",(int)(cerclebleu.getX()+(cerclebleu.getWidth()/3)),(int)(cerclebleu.getY()+(cerclebleu.getHeight()/2)));     
		g2d.drawString(""+model.getMax(),(int)(cerclebleu.getX()+(cerclebleu.getWidth()/3)),(int)(cerclebleu.getY()+(cerclebleu.getHeight()/2)+30));
		dessinerLesRectangles(g2d);
		//indice=-1;

	}




	@Override
	public void update(Observable arg0, Object arg1) {
		// TODO Auto-generated method stub
		init();
		repaint();

	}


	public int getIndice() {
		return indice;
	}

	public void setIndice(int indice) {
		this.indice = indice;
	}

	public ArrayList<Arc2D.Float> getArcs() {
		return arcs;
	}

	public void setArcs(ArrayList<Arc2D.Float> arcs) {
		this.arcs = arcs;
	}

	public Arc2D.Float getCercleblanche() {
		return cercleblanche;
	}

	public void setCercleblanche(Arc2D.Float cercleblanche) {
		this.cercleblanche = cercleblanche;
	}

	public Arc2D.Float getCerclebleu() {
		return cerclebleu;
	}

	public void setCerclebleu(Arc2D.Float cerclebleu) {
		this.cerclebleu = cerclebleu;
	}





}
