package model;

import processing.core.PApplet;

public class Logic extends PApplet{
	PApplet app;
	Figure ellipse;
	
	public Logic (PApplet app) {
		this.app=app;
		ellipse= new Ellipse(50,50,this.app);
	}
	public void drawCircle() {
		ellipse.paintFigure();
	}
	public void readText() {
		
	}

}
